package top.wetor.service;

import top.wetor.domain.User;

import java.util.List;

public interface IUserService {
    /**
     * 创建用户
     * @param user user
     */
    void insertUser(User user);
    /**
     * 通过id删除用户
     * @param id id
     */
    void deleteUserById(Integer id);
    /**
     * 修改用户
     * @param user user
     */
    void updateUser(User user);
    /**
     * 通过id查询user
     * @param id id
     * @return user
     */
    User selectUserById(Integer id);

    /**
     * 通过用户名模糊查询
     * @param name 包含字符
     * @return 用户列表
     */
    List<User> selectUserByName(String name);

    /**
     * 通过用户名和密码查询用户
     * @param user 需要user.name user.password
     * @return 查询到的用户
     */
    User selectUserLogin(User user);
}
