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

@WebServlet("/Good")
public class GoodServlet extends HttpServlet {
    GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String flag = request.getParameter("action");
        if ("all".equals(flag)) {
            List<Good> goodsSg = goodService.allGoodSgService();//水果
            List<Good> goodsLyfs=goodService.allGoodLyfsService();//粮油副食
            List<Good> goodsXh=goodService.allGoodXhService();//洗护
            List<Good> goodsSj=goodService.allGoodSjService();//手机
            List<Good> goodsSxj=goodService.allGoodSxjService();//摄像机
            List<Good> goodsJd=goodService.allGoodJdService();//家电
            List<Good> goodsJj=goodService.allGoodJjService();//家具
            request.getSession().setAttribute("goodsSg",goodsSg);
            request.getSession().setAttribute("goodsLyfs",goodsLyfs);
            request.getSession().setAttribute("goodsXh", goodsXh);
            request.getSession().setAttribute("goodsSj",goodsSj);
            request.getSession().setAttribute("goodsSxj",goodsSxj);
            request.getSession().setAttribute("goodsJd",goodsJd);
            request.getSession().setAttribute("goodsJj",goodsJj);
            response.sendRedirect("/index.jsp");
        }
//        else if("del".equals(flag)){
//            int goodId= Integer.parseInt(request.getParameter("goodId"));
//            boolean result=goodService.delGoodByIdService(goodId);
//            if(result){
//                response.sendRedirect("/Good?action=all");
//            }else {
//                request.setAttribute("msg","操作失败");
//                request.getRequestDispatcher("/main.jsp").forward(request,response);
//            }
    }
}
