package top.wetor.service;


import top.wetor.domain.Group;

import java.util.List;

public interface IGroupService {
    /**
     * 新建组
     * @param group 组
     */
    void insertGroup(Group group);
    /**
     * 通过id删除组
     * @param id id
     */
    void deleteGroupById(Integer id);
    /**
     * 修改组
     * @param group 组
     */
    void updateGroup(Group group);
    /**
     * 通过id查询文章组
     * @param id id
     * @return 组
     */
    Group selectGroupById(Integer id);

    /**
     * 通过组id获取组内文章数量
     * @param id id
     * @return 文章数量
     */
    Integer selectGroupArticleCountById(Integer id);
    /**
     * 查询组数
     * @return 组数
     */
    Integer selectGroupCount();

    /**
     * 查询按rank有小到大排序的一定数量组
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @return 组列表
     */
    List<Group> selectGroupPage(Integer begin, Integer number);

    /**
     * 查询全部组
     * @return 全部组列表
     */
    List<Group> selectGroupAll();
}
