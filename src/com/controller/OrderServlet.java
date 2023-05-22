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
import java.util.List;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    OrderService orderService = new OrderServiceImpl();
    CarService carService = new CarServiceImpl();

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
        String flag=request.getParameter("action");
        if("all".equals(flag)){
            List<Order> orders = orderService.allOrderService(userName);
            request.setAttribute("orders", orders);
            request.getRequestDispatcher("order.jsp").forward(request,response);
        }else if("del".equals(flag)){
            int id =Integer.parseInt(request.getParameter("id"));
                    if(orderService.delOrderService(id)){
                        System.out.println("订单删除成功");
                        response.sendRedirect("/order?action=all");
                    }else {
                        System.out.println("订单删除失败");
                        request.setAttribute("msg","删除失败");
                        request.getRequestDispatcher("/order.jsp").forward(request,response);
                    }
                }

        }


}
