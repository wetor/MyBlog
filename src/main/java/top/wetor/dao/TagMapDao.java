package top.wetor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wetor.domain.Article;
import top.wetor.domain.Tag;

import java.util.List;
@Component
@Mapper
public interface TagMapDao {
    /**
     * 创建标签映射
     * @param tagMap Tag
     */
    void insertTagMap(TagMapDao tagMap);
    /**
     * 创建帖子时创建标签映射
     * @param id 文章id
     * @param tags Tag
     */
    void insertTagMapByArticle(@Param("articleId") Integer id,@Param("tags") String tags);
    /**
     * 用Article id删除标签映射
     * @param id Tag
     */
    void deleteTagMapByArticleId(Integer id);
    /**
     * 根据帖子查询标签
     * @param id 帖子id
     * @return List<Tag>
     */
    List<Tag> selectTagByArticleId(Integer id);



}
