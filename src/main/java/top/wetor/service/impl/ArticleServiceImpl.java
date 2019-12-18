package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.ArticleDao;
import top.wetor.dao.TagDao;
import top.wetor.dao.TagMapDao;
import top.wetor.domain.Article;
import top.wetor.service.IArticleService;
import top.wetor.utils.ArticleContentShow;
import top.wetor.domain.*;
import top.wetor.utils.ArticleStateShow;

import java.util.List;
@Service("articleService")
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private TagDao tagDao;
    @Autowired
    private TagMapDao tagMapDao;

    private Integer getContentShow(ArticleContentShow content){
        switch (content){
            case MINI: return 0;
            case SIMPLE: return 1;
            case COMPLETE: return 2;
        }
        return 0;
    }
    private Integer getStateShow(ArticleStateShow state){
        switch (state){
            case NORMAL: return 0;
            case TOP: return 1;
            case HIDDEN: return 2;
            case DELETE: return 3;
            case USER: return 4;
            case ADMIN: return 5;
        }
        return 0;
    }
    private ArticleStateShow getStateShowByArticle(Article article){
        if(article.getDelete()) return ArticleStateShow.DELETE;
        if(article.getHidden()) return ArticleStateShow.HIDDEN;
        if(article.getTop()) return ArticleStateShow.TOP;
        return ArticleStateShow.NORMAL;
    }
    private Integer getBeanType(Object bean){
        if(bean instanceof User) return 0;
        if(bean instanceof Group) return 1;
        if(bean instanceof Tag) return 2;
        return null;
    }
    /**
     * 把文章加入数据库,并更新标签和标签映射表
     * @param article 文章
     */
    @Override
    public void insertArticle(Article article) {
        Integer nextId=articleDao.selectNextArticleId();
        articleDao.insertArticle(article);
        tagDao.updateTagByString(article.getTags());
        tagMapDao.insertTagMapByArticle(nextId,article.getTags());
    }
    /**
     * 删除(隐藏)文章,并更新标签和标签映射表
     * @param id 文章id
     */
    @Override
    public void deleteArticleById(Integer id) {

        Article article = articleDao.selectArticleById(id,getContentShow(ArticleContentShow.MINI));//极简查询

        Article updateArticle=new Article();
        updateArticle.setId(article.getId());
        updateArticle.setDelete(true);
        updateArticle.setTop(false);
        updateArticle.setHidden(false);

        articleDao.updateArticle(updateArticle);
        tagDao.deleteTagByString(article.getTags());
        tagMapDao.deleteTagMapByArticleId(article.getId());
    }
    /**
     * 通过id恢复删除的文章
     * @param id id
     */
    @Override
    public void deleteArticleRestoreById(Integer id) {
        Article article = articleDao.selectArticleById(id,getContentShow(ArticleContentShow.MINI));//极简查询
        if(getStateShowByArticle(article)!=ArticleStateShow.DELETE){
            //TODO 抛出异常
            return;
        }
        article.setDelete(false);

        articleDao.updateArticle(article);
        tagDao.updateTagByString(article.getTags());
        tagMapDao.insertTagMapByArticle(article.getId(),article.getTags());
    }
    /**
     * 通过id完全删除文章
     * @param id id
     */
    @Override
    public void deleteArticleCompleteById(Integer id) {
        Article article = articleDao.selectArticleById(id,getContentShow(ArticleContentShow.MINI));//极简查询
        if(getStateShowByArticle(article)!=ArticleStateShow.DELETE){
            //TODO 抛出异常
            return;
        }
        articleDao.deleteArticleById(id);
    }

    @Override
    public void updateArticle(Article article) {
        Article oldArticle = articleDao.selectArticleById(article.getId(),getContentShow(ArticleContentShow.MINI));//极简查询
        tagDao.deleteTagByString(oldArticle.getTags());
        tagMapDao.deleteTagMapByArticleId(oldArticle.getId());


        articleDao.updateArticle(article);
        tagDao.updateTagByString(article.getTags());
        tagMapDao.insertTagMapByArticle(article.getId(),article.getTags());
    }

    @Override
    public Article selectArticleById(Integer id, ArticleContentShow content) {
        return articleDao.selectArticleById(id,getContentShow(content));
    }

    @Override
    public Integer selectArticleCount(ArticleStateShow state) {
        return articleDao.selectArticleCount(getStateShow(state));
    }

    @Override
    public List<Article> selectArticlePage(Integer begin, Integer number, ArticleContentShow content, Boolean asc, ArticleStateShow state) {
        return articleDao.selectArticlePage(begin, number, getContentShow(content), asc, getStateShow(state));
    }

    @Override
    public List<Article> selectArticleAll(ArticleContentShow content, Boolean asc, ArticleStateShow state) {
        return articleDao.selectArticleAll(getContentShow(content), asc, getStateShow(state));
    }

    @Override
    public List<Article> selectArticleAllByBean(Object bean, ArticleContentShow content, Boolean asc, ArticleStateShow state) {
        return articleDao.selectArticleAllByType(getBeanType(bean), ((BaseBean)bean).getId(), getContentShow(content), asc, getStateShow(state));
    }

    @Override
    public List<Article> selectArticlePageByBean(Object bean, Integer begin, Integer number, ArticleContentShow content, Boolean asc, ArticleStateShow state) {
        return articleDao.selectArticlePageByType(getBeanType(bean), ((BaseBean)bean).getId(), begin, number, getContentShow(content), asc, getStateShow(state));

    }
}
