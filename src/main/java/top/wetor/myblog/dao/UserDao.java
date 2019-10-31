package top.wetor.myblog.dao;

import top.wetor.myblog.bean.User;

public interface  UserDao {
    public User getUserById(Integer id);
    public void insertUser(User user);
}
