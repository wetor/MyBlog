package top.wetor.service;

import top.wetor.domain.Tag;

import java.util.List;

public interface ITagService {
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
     * 通过Content删除标签
     * @param content Content
     */
    void deleteTagByContent(String content);
    /**
     * 通过String更新标签
     * @param tags TagString
     */
    void updateTagByString(String tags);
    /**
     * 更新所有标签
     * @Param list 每个文章的标签组
     */
    void updateTagAll(List<String> list);
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
