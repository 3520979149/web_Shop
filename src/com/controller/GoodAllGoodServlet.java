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
@WebServlet("/search")
public class GoodAllGoodServlet extends HttpServlet {
    GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String search=request.getParameter("search");
        String BlurSearch="%"+search+"%";
        if(BlurSearch.equals("%null%")){
            List<Good> goods=goodService.allGoodService();
            request.setAttribute("goods", goods);
            request.getRequestDispatcher("/moreGood.jsp").forward(request,response);
        }else {
            List<Good> goods=goodService.allGoodBlurService(BlurSearch);
            if(goods==null){

                request.setAttribute("nullgood", "没有找到你要查找的商品！");
                request.getRequestDispatcher("/moreGood.jsp").forward(request,response);
            }else {
                request.setAttribute("goods", goods);
                request.setAttribute("search",search);
                request.getRequestDispatcher("/moreGood.jsp").forward(request,response);
            }
        }

    }
}
