package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.ArticleDao;
import top.wetor.domain.Article;
import top.wetor.service.IArticleService;

import java.util.List;
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public void insertArticle(Article article) {
        articleDao.insertArticle(article);
    }

    @Override
    public void deleteArticleById(Integer id) {
        articleDao.deleteArticleById(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public Article selectArticleById(Integer id, Integer mode) {
        return articleDao.selectArticleById(id,mode);
    }

    @Override
    public Integer selectArticleCount() {
        return articleDao.selectArticleCount();
    }

    @Override
    public List<Article> selectArticlePage(Integer begin, Integer number, Integer mode, Boolean asc) {
        return articleDao.selectArticlePage(begin, number, mode, asc);
    }

    @Override
    public List<Article> selectArticleAll(Integer mode, Boolean asc) {
        return articleDao.selectArticleAll(mode, asc);
    }

    @Override
    public List<Article> selectArticleAllByType(Integer type, Integer id, Integer mode, Boolean asc) {
        return articleDao.selectArticleAllByType(type, id, mode, asc);
    }

    @Override
    public List<Article> selectArticlePageByType(Integer type, Integer id, Integer begin, Integer number, Integer mode, Boolean asc) {
        return articleDao.selectArticlePageByType(type, id, begin, number, mode, asc);
    }
}
