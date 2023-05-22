package com.model.dao.impl;

import com.model.dao.OrderDao;
import com.model.entity.Good;
import com.model.entity.Order;
import com.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OrderDaoImpl implements OrderDao {
    List<Order> list = new ArrayList<>();

    @Override
    public List<Order> allOrderDao(String userName) {
        List<Order> orders = new ArrayList<>();
        String sql = "select * from `order` where userName=?";

        try {
            list = DBUtil.queryRunner.query(sql, new BeanListHandler<>(Order.class), userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Order order : list) {
            Order order1 = new Order();
            order1.setOrderId(order.getOrderId());
            order1.setUserName(order.getUserName());
            order1.setOrderState(order.getOrderState());
            order1.setGoodId(order.getGoodId());
            order1.setGoodPic(order.getGoodPic());
            order1.setGoodDes(order.getGoodDes());
            order1.setTotalPrice(order.getTotalPrice());
            order1.setGoodQuantity(order.getGoodQuantity());
            order1.setGoodName(order.getGoodName());
            order1.setCreateTime(order.getCreateTime());
            order1.setReceiptName(order.getReceiptName());
            orders.add(order1);
        }
        return orders;
    }

    @Override
    public Order allOrderXqDao(String userName, int goodId) {
        Order order = null;
        String sql = "select * from `order` where userName=? and goodId=?";

        try {
            order= DBUtil.queryRunner.query(sql, new BeanHandler<>(Order.class),userName,goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public Order allOrderIdDao(int orderId) {
        Order order = null;
        String sql = "select * from `order` where orderId=?";

        try {
            order= DBUtil.queryRunner.query(sql, new BeanHandler<>(Order.class),orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public int addOrderDao(int orderId, String userName, String orderState,int goodId, String goodPic,
                           String goodDes, Double totalPrice,
                           int goodQuantity,
                           String goodName, String createTime, String receiptName) {
        String sql = "insert into `order` (orderId, userName, orderState,goodId,goodPic,goodDes, totalPrice, " +
                "goodQuantity, " +
                "goodName, " +
                "createTime, receiptName) " +
                "values (?," +
                "?," +
                "?,?,?,?,?,?,?,?,?)";
        int num = 0;
        try {
            num = DBUtil.queryRunner.update(sql, orderId, userName, orderState,goodId, goodPic, goodDes, totalPrice,
                    goodQuantity,
                    goodName,
                    createTime, receiptName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }

    @Override
    public boolean updateOrderSlDao(String userName, String goodName, int goodQuantity) {
        String sql = "update `order` set goodQuantity=? where userName=? and goodName=?";
        int num = 0;
        boolean flag = false;
        try {
            num = DBUtil.queryRunner.update(sql, goodQuantity, userName, goodName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (num > 0) {
            flag = true;

        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean updateOrderStateDao(String userName, String orderState) {
        String sql="update `order` set orderState=? WHERE userName=?";
        int num = 0;
        boolean flag = false;
        try {
            num = DBUtil.queryRunner.update(sql, orderState,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (num > 0) {
            flag = true;

        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean updateCreateTimeDao(String userName, String createTime) {
        String sql="update `order` set createTime=? WHERE userName=?";
        int num = 0;
        boolean flag = false;
        try {
            num = DBUtil.queryRunner.update(sql, createTime,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (num > 0) {
            flag = true;

        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean updateOrderIdStateDao(int orderId, String orderState) {
        String sql="update `order` set orderState=? WHERE orderId=?";
        int num = 0;
        boolean flag = false;
        try {
            num = DBUtil.queryRunner.update(sql, orderState,orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (num > 0) {
            flag = true;

        } else {
            flag = false;
        }
        return flag;    }

    @Override
    public boolean delOrderDao(int orderId) {
        boolean flag;
        String sql = "delete from `order` where orderId=?";

        int num= 0;
        try {
            num = DBUtil.queryRunner.update(sql,orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num>0){
            flag = true;
        }else {
            flag=false;
        }
        return flag;
    }
}
