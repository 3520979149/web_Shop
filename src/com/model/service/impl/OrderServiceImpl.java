package com.model.service.impl;

import com.model.dao.OrderDao;
import com.model.dao.impl.OrderDaoImpl;
import com.model.entity.Order;
import com.model.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao=new OrderDaoImpl();

    @Override
    public List<Order> allOrderService(String userName) {
        return orderDao.allOrderDao(userName);
    }

    @Override
    public Order allOrderXqService(String userName, int goodId) {
        return orderDao.allOrderXqDao(userName, goodId);
    }

    @Override
    public Order allOrderIdService(int orderId) {
        return orderDao.allOrderIdDao(orderId);
    }

    @Override
    public int addOrderService(int orderId, String userName, String orderState,int goodId,String goodPic,String goodDes,
                               Double totalPrice,
                               int goodQuantity,
                               String goodName, String createTime, String receiptName) {
        return orderDao.addOrderDao(orderId, userName, orderState,goodId, goodPic,goodDes,totalPrice, goodQuantity,
                goodName,
                createTime, receiptName);
    }

    @Override
    public boolean updateOrderSlService(String userName, String goodName, int goodQuantity) {
        return orderDao.updateOrderSlDao(userName, goodName, goodQuantity);
    }

    @Override
    public boolean updateOrderStateService(String userName, String orderState) {
        return orderDao.updateOrderStateDao(userName, orderState);
    }

    @Override
    public boolean updateCreateTimeService(String userName, String createTime) {
        return orderDao.updateCreateTimeDao(userName, createTime);
    }

    @Override
    public boolean updateOrderIdStateService(int orderId, String orderState) {
        return orderDao.updateOrderIdStateDao(orderId, orderState);
    }

    @Override
    public boolean delOrderService(int orderId) {
        return orderDao.delOrderDao(orderId);
    }
}
