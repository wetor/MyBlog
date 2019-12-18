package top.wetor.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wetor.domain.Article;
import top.wetor.domain.Group;
import top.wetor.domain.Tag;
import top.wetor.service.IArticleService;
import top.wetor.utils.ArticleContentShow;
import top.wetor.utils.ArticleStateShow;
import wetor.test.BaseTest;

import java.util.Date;
import java.util.List;


public class ArticleServiceImplTest extends BaseTest {

    @Test
    public void insertArticle() {
        Article article=new Article();
        article.setGroupId(1);
        article.setUserId(1);
        article.setTitle("title22223333");
        article.setTags("tag3,tag2,tag1");
        article.setCreateTime(new Date());
        article.setModifyTime(new Date());
        article.setLookNum(1);
        article.setLoveNum(1);
        articleService.insertArticle(article);
    }

    @Test
    public void deleteArticleById() {
        articleService.deleteArticleById(23);
    }

    @Test
    public void deleteArticleRestoreById() {
        articleService.deleteArticleRestoreById(22);
    }

    @Test
    public void deleteArticleCompleteById() {
        articleService.deleteArticleCompleteById(22);
    }

    @Test
    public void updateArticle() {
    }

    @Test
    public void selectArticleById() {
        Article article=articleService.selectArticleById(1,ArticleContentShow.SIMPLE);
        System.out.println(article);
    }

    @Test
    public void selectArticleCount() {
        System.out.println(articleService.selectArticleCount(ArticleStateShow.DELETE));

    }

    @Test
    public void selectArticlePage() {
    }

    @Test
    public void selectArticleAll() {
        List<Article> articleList=articleService.selectArticleAll(ArticleContentShow.MINI, ArticleStateShow.NORMAL,null);
        for(Article article:articleList) {
            System.out.println(article);
        }
    }

    @Test
    public void selectArticleAllByBean() {
        //Group group=new Group();
        //group.setId(1);
        Tag tag=new Tag();
        tag.setId(110);
        List<Article> articleList=articleService.selectArticleAllByBean(tag,ArticleContentShow.MINI,ArticleStateShow.ADMIN,null);
        for(Article article:articleList) {
            System.out.println(article);
        }
    }

    @Test
    public void selectArticlePageByBean() {
    }
}
