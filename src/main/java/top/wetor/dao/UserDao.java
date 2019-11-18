package top.wetor.dao;

import top.wetor.bean.User;

public interface  UserDao {
    public User getUserById(Integer id);
    public void insertUser(User user);
}
