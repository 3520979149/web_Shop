package com.model.dao;

import com.model.entity.Car;
import com.model.entity.Good;
import com.model.entity.Order;

import javax.swing.*;
import java.util.List;

public interface OrderDao {
    public List<Order> allOrderDao(String userName);
    public Order allOrderXqDao(String userName,int goodId);
    public Order allOrderIdDao(int orderId);
    public int addOrderDao(int orderId, String userName, String orderState,int goodId, String goodPic,String goodDes,
                           Double totalPrice, int goodQuantity,
                           String goodName,String createTime,String receiptName);
    public boolean updateOrderSlDao(String userName, String goodName, int goodQuantity);
    public boolean updateOrderStateDao(String userName,String orderState);
    public boolean updateCreateTimeDao(String userName,String createTime);
    public boolean updateOrderIdStateDao(int orderId,String orderState);
    public boolean delOrderDao(int orderId);
}
