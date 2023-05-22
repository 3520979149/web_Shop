package com.controller;

import com.model.entity.Order;
import com.model.entity.User;
import com.model.service.OrderService;
import com.model.service.UserService;
import com.model.service.impl.OrderServiceImpl;
import com.model.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/orderXq")
public class OrderXqServlet extends HttpServlet {
    OrderService orderService=new OrderServiceImpl();
    UserService userService=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        String userName= (String) session.getAttribute("USER");
        int orderId= Integer.parseInt(request.getParameter("orderId"));
        User user=userService.allUserDao(userName);
        request.setAttribute("address",user.getAddRess());
        Order order=orderService.allOrderIdService(orderId);
        request.setAttribute("orderState",order.getOrderState());
        request.setAttribute("goodId",order.getGoodId());
        request.setAttribute("orderId",order.getOrderId());
        request.setAttribute("goodPic",order.getGoodPic());
        request.setAttribute("goodName",order.getGoodName());
        request.setAttribute("createTime",order.getCreateTime());
        request.setAttribute("userName",userName);
        request.getRequestDispatcher("/orderXq.jsp").forward(request,response);

    }

}
