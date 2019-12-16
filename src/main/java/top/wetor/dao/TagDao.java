package top.wetor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wetor.domain.Tag;

import java.util.List;
@Component
@Mapper
public interface TagDao {
    /**
     * 创建标签
     * @param tag Tag
     */
    void insertTag(Tag tag);
    /**
     * 通过id删除标签
     * @param id id
     */
    void deleteTagById(Integer id);
    /**
     * 通过tag列表删除标签
     * @param tags tags
     */
    void deleteTagByString(@Param("tags") String tags);
    /**
     * 通过String更新标签
     * @param tags TagString
     */
    void updateTagByString(@Param("tags") String tags);
    /**
     * 更新所有标签
     * @Param list 每个文章的标签组
     */
    void updateTagAll(@Param("list") List<String> list);
    /**
     * 通过id查询Tag
     * @param id id
     * @return Tag
     */
    Tag selectTagById(Integer id);

    /**
     * 通过content查询Tag
     * @param content id
     * @return Tag
     */
    Tag selectTagByContent(String content);

    /**
     * 查询标签数
     * @return 标签数
     */
    Integer selectTagCount();
}
