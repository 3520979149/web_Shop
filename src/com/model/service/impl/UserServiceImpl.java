package com.model.service.impl;

import com.model.dao.UserDao;
import com.model.dao.impl.UserDaoImpl;
import com.model.entity.User;
import com.model.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    @Override
    public User infoUserService(String userName, String userPwd) {
        return userDao.infoUserDao(userName,userPwd);
    }

    @Override
    public int addUserService(User user) {
        return userDao.addUserDao(user);
    }

    @Override
    public User allUserDao(String userName) {
        return userDao.allUserDao(userName);
    }
}
