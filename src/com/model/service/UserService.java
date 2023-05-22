package com.model.service;

import com.model.entity.User;

public interface UserService {
    /**
     * 用户登录
     * @param userName
     * @param userPwd
     * @return
     */
    User infoUserService(String userName,String userPwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int addUserService(User user);
    User allUserDao(String userName);
}
