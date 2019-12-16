package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.UserDao;
import top.wetor.domain.User;
import top.wetor.service.IUserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<User> selectUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    @Override
    public User selectUserLogin(User user) {
        return userDao.selectUserLogin(user);
    }
}
