package top.wetor.service.impl;

import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.ArticleDao;
import top.wetor.dao.TagDao;
import top.wetor.dao.TagMapDao;
import top.wetor.domain.Article;
import top.wetor.service.IArticleService;
import top.wetor.utils.ArticleMode;
import top.wetor.domain.*;

import java.util.List;
@Service("articleService")
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private TagDao tagDao;
    @Autowired
    private TagMapDao tagMapDao;

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
     * 完全删除文章,并更新标签和标签映射表
     * @param id 文章id
     */
    @Override
    public void deleteArticleById(Integer id) {
        Article article = articleDao.selectArticleById(id,0);//极简查询
        articleDao.deleteArticleById(id);
        tagDao.deleteTagByString(article.getTags());
        tagMapDao.deleteTagMapByArticleId(article.getId());


    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public Article selectArticleById(Integer id, ArticleMode mode) {
        switch (mode){
            case MINI:
                return articleDao.selectArticleById(id,0);
            case SIMPLE:
                return articleDao.selectArticleById(id,1);
            case COMPLETE:
                return articleDao.selectArticleById(id,2);
        }
        return null;

    }

    @Override
    public Integer selectArticleCount() {
        return articleDao.selectArticleCount();
    }

    @Override
    public List<Article> selectArticlePage(Integer begin, Integer number, ArticleMode mode, Boolean asc) {
        switch (mode){
            case MINI:
                return articleDao.selectArticlePage(begin, number, 0, asc);
            case SIMPLE:
                return articleDao.selectArticlePage(begin, number, 1, asc);
            case COMPLETE:
                return articleDao.selectArticlePage(begin, number, 2, asc);
        }
        return null;
    }

    @Override
    public List<Article> selectArticleAll(ArticleMode mode, Boolean asc) {
        switch (mode){
            case MINI:
                return articleDao.selectArticleAll(0, asc);
            case SIMPLE:
                return articleDao.selectArticleAll(1, asc);
            case COMPLETE:
                return articleDao.selectArticleAll(2, asc);
        }
        return null;
    }

    @Override
    public List<Article> selectArticleAllByBean(Object bean, ArticleMode mode, Boolean asc) {
        if(bean instanceof User)
            return articleDao.selectArticleAllByType(0, ((User)bean).getId(), 0, asc);
        if(bean instanceof Group)
            return articleDao.selectArticleAllByType(1, ((Group)bean).getId(), 1, asc);
        if(bean instanceof Tag)
            return articleDao.selectArticleAllByType(2, ((Tag)bean).getId(), 2, asc);
        return null;
    }

    @Override
    public List<Article> selectArticlePageByBean(Object bean, Integer begin, Integer number, ArticleMode mode, Boolean asc) {
        if(bean instanceof User)
            return articleDao.selectArticlePageByType(0, ((User)bean).getId(), begin, number, 0, asc);
        if(bean instanceof Group)
            return articleDao.selectArticlePageByType(1, ((Group)bean).getId(), begin, number,1, asc);
        if(bean instanceof Tag)
            return articleDao.selectArticlePageByType(2, ((Tag)bean).getId(), begin, number, 2, asc);
        return null;
    }
}
