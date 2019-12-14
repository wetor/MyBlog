package top.wetor.service;


import top.wetor.dao.TagMapDao;
import top.wetor.domain.Article;
import top.wetor.domain.Tag;

import java.util.List;

public interface ITagMapService {
    /**
     * 创建标签映射
     * @param tagMap Tag
     */
    void insertTagMap(TagMapDao tagMap);
    /**
     * 创建帖子时创建标签映射
     * @param a_id 文章id
     * @param tags Tag
     */
    void insertTagMapByArticle(Integer a_id, String tags);
    /**
     * 用Article id删除标签映射
     * @param a_id Tag
     */
    void deleteTagMapByArticleId(Integer a_id);
    /**
     * 根据帖子查询标签
     * @param a_id 帖子id
     * @return List<Tag>
     */
    List<Tag> selectTagByArticleId(Integer a_id);
    /**
     * 根据标签查询帖子
     * @param t_id 标签id
     * @param mode null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @param asc 是否正序排列(由旧到新)
     * @return 全部文章列表
     */
    List<Article> selectArticleByTagId(Integer t_id, Integer mode, Boolean asc);
}
