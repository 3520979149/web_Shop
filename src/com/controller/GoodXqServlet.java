package com.controller;

import com.model.entity.Good;
import com.model.service.GoodService;
import com.model.service.impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GoodXQ")
public class GoodXqServlet extends HttpServlet {
    GoodService goodService = new GoodServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int flag = Integer.parseInt(request.getParameter("ID"));
        Good goodXq = goodService.allGoodXqService(flag);
        request.setAttribute("goodXq", goodXq);
        System.out.println(goodXq.getGoodId()+"--"+goodXq.getGoodPic());
        String add= (String) request.getAttribute("addcar");
        request.setAttribute("add", add);
        request.getRequestDispatcher("fruit.jsp").forward(request, response);

    }
}
