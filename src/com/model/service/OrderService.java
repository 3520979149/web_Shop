package com.model.service;

import com.model.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> allOrderService(String userName);
    public Order allOrderXqService(String userName,int goodId);
    public Order allOrderIdService(int orderId);
    public int addOrderService(int orderId, String userName, String orderState,int goodId,String goodPic,String goodDes,
                               Double totalPrice,
                               int goodQuantity,
                           String goodName,String createTime,String receiptName);
    public boolean updateOrderSlService(String  userName, String goodName, int goodQuantity);
    public boolean updateOrderStateService(String userName,String orderState);
    public boolean updateCreateTimeService(String userName,String createTime);
    public boolean updateOrderIdStateService(int orderId,String orderState);
    public boolean delOrderService(int orderId);
}
