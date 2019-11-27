package top.wetor.dao;

import top.wetor.bean.User;

public interface  UserDao {
    User getUser(Integer id);
    User getUser(String name);
    void addUser(User user);
    void deleteUser(Integer id);
    void deleteUser(String name);

}
