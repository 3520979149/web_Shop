package com.controller;

import com.model.entity.Order;
import com.model.service.CarService;
import com.model.service.OrderService;
import com.model.service.impl.CarServiceImpl;
import com.model.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/pay")
public class PayServlet extends HttpServlet {
    CarService carService=new CarServiceImpl();
    OrderService orderService=new OrderServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("USER");
        if (carService.allcarService(userName) != null) {
            if (carService.delcarTotalService(userName)) {
                System.out.println("清除购物车成功");
            } else {
                System.out.println("清除购物车失败");
            }
        }
                String orderState = "已付款";
                if (orderService.updateOrderStateService(userName, orderState)) {
                    System.out.println("订单状态修改成功");
                } else {
                    System.out.println("订单状态修改失败");
                }

                Date day = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime = sdf.format(day);
                if (orderService.updateCreateTimeService(userName, createTime)) {
                    System.out.println("订单时间添加成功");
                } else {
                    System.out.println("订单时间添加失败");
                }

        request.getRequestDispatcher("/order?action=all").forward(request,response);
    }
}
