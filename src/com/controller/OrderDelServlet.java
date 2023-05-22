package com.controller;

import com.model.entity.Order;
import com.model.service.OrderService;
import com.model.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/orderDel")
public class OrderDelServlet extends HttpServlet {
    OrderService orderService=new OrderServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        String orderState="已收货";
        if(orderService.updateOrderIdStateService(orderId,orderState)){
            System.out.println("订单状态修改为已收货");
            request.getRequestDispatcher("/orderXq?ID="+orderId).forward(request,response);
        }else {
            System.out.println("修改失败");
        }
    }
}
