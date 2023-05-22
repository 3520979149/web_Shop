package com.model.dao.impl;

import com.model.dao.UserDao;
import com.model.entity.Order;
import com.model.entity.User;
import com.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public User infoUserDao(String userName,String userPwd) {
        String sql="select * from user where userName=? and userPwd=?";
        User user=null;
        try {
            user=DBUtil.queryRunner.query(sql,new BeanHandler<>(User.class),userName,userPwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int addUserDao(User user) {
        String sql="insert into user(userName,userEmail,userPwd,address) values(?,?,?,?)";
        int row=0;
        try {
            row= DBUtil.queryRunner.update(sql,user.getUserName(),user.getUserEmail(),
                    user.getUserPwd(),user.getAddRess());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public User allUserDao(String userName) {
        User user = null;
        String sql = "select * from user where userName=?";

        try {
            user= DBUtil.queryRunner.query(sql, new BeanHandler<>(User.class),userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
