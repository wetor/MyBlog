package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.wetor.dao.UserDao;
import top.wetor.domain.User;
import top.wetor.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
