package com.model.dao;

import com.model.entity.User;

import javax.swing.*;

public interface UserDao {
    /**
     * 用户登录
     * @param userName
     * @param userPwd
     * @return
     */
    User infoUserDao(String userName,String userPwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int addUserDao(User user);

    User allUserDao(String userName);
}
