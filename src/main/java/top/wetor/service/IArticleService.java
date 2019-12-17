package top.wetor.service;

import top.wetor.domain.Article;
import top.wetor.utils.ArticleMode;

import java.util.List;

public interface IArticleService {
    /**
     * 新建文章
     * @param article 文章
     */
    void insertArticle(Article article);
    /**
     * 通过id完全文章（可恢复）
     * @param id id
     */
    void deleteArticleById(Integer id);
    /**
     * 通过id恢复删除的文章
     * @param id id
     */
    void deleteArticleRestoreById(Integer id);
    /**
     * 通过id完全删除文章
     * @param id id
     */
    void deleteArticleCompleteById(Integer id);
    /**
     * 修改文章信息
     * @param article 文章
     */
    void updateArticle(Article article);
    /**
     * 通过id查询文章
     * @param id id
     * @param mode null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @return 文章
     */
    Article selectArticleById(Integer id, ArticleMode mode);
    /**
     * 查询文章数
     * @return 文章数
     */
    Integer selectArticleCount();
    /**
     * 查询按时间排序的一定数量文章
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param mode MINI:极简(不含文章内容) SIMPLE:简略(含文章内容摘要) COMPLETE:完整(包含文章内容)
     * @param asc 是否正序排列(由旧到新)
     * @return 文章列表
     */
    List<Article> selectArticlePage(Integer begin, Integer number, ArticleMode mode, Boolean asc);

    /**
     * 查询全部文章
     * @param mode MINI:极简(不含文章内容) SIMPLE:简略(含文章内容摘要) COMPLETE:完整(包含文章内容)
     * @param asc 是否正序排列(由旧到新)
     * @return 全部文章列表
     */
    List<Article> selectArticleAll(ArticleMode mode, Boolean asc);
    /**
     * 查询属于指定对象的全部文章
     * @param bean User  Group  Tag
     * @param mode MINI:极简(不含文章内容) SIMPLE:简略(含文章内容摘要) COMPLETE:完整(包含文章内容)
     * @param asc 是否正序排列(由旧到新)
     * @return 全部文章列表
     */
    List<Article> selectArticleAllByBean(Object bean, ArticleMode mode, Boolean asc);
    /**
     * 查询属于指定对象的一定数量文章
     * @param bean User  Group  Tag
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param mode MINI:极简(不含文章内容) SIMPLE:简略(含文章内容摘要) COMPLETE:完整(包含文章内容)
     * @param asc 是否正序排列(由旧到新)
     * @return 文章列表
     */
    List<Article> selectArticlePageByBean(Object bean, Integer begin, Integer number, ArticleMode mode, Boolean asc);

}
