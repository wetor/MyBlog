package top.wetor.myblog.mapper;

import top.wetor.myblog.bean.User;

import java.util.List;

public interface UserMapper {
    public User selectUserById(Integer id);
    public List<User> selectUserByName(String name);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserById(Integer id);
}
