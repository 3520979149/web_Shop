package com.controller;

import com.model.entity.Car;
import com.model.entity.Good;
import com.model.entity.Order;
import com.model.service.CarService;
import com.model.service.GoodService;
import com.model.service.OrderService;
import com.model.service.impl.CarServiceImpl;
import com.model.service.impl.GoodServiceImpl;
import com.model.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet("/Car")
public class CarServlet extends HttpServlet {
    GoodService goodService = new GoodServiceImpl();
    CarService carService = new CarServiceImpl();
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

        String flag=request.getParameter("action");
        if(flag.equals("all")){
            List<Car> cars = carService.allcarService(userName);
            if(cars.isEmpty()){
                request.setAttribute("carnull", "您的购物车空空如也，快去购买商品吧！");
                request.getRequestDispatcher("/car.jsp").forward(request, response);
            }else {
                long total= carService.allQuantityService(userName);
                Double TotalPrice=0.0;
                for(Car car:cars){
                    TotalPrice+=car.getGoodTotal();
                }
                request.setAttribute("TotalPrice",TotalPrice);
                request.setAttribute("usercar", cars);
                request.setAttribute("total",total);
                request.getRequestDispatcher("/car.jsp").forward(request, response);
            }
        }else if(flag.equals("add")){
            int goodsId = Integer.parseInt(request.getParameter("carID"));
                if(carService.allWhetherDao(goodsId,userName)){
                    Car Repeat=carService.allRepeatService(goodsId,userName);
                    int goodQuantity=Repeat.getGoodQuantity()+1;
                    Double goodTotal= Repeat.getGoodPrice()*goodQuantity;
                    if(goodService.updateSlCarService(goodsId,userName,goodQuantity,goodTotal)){
                        Good good = goodService.allGoodXqService(goodsId);
                        String goodName=good.getGoodName();
                        if(orderService.updateOrderSlService(userName, goodName, goodQuantity)){
                            System.out.println("订单修改成功");
                        }else {
                            System.out.println("订单修改失败");
                        }
                        request.setAttribute("addcar", "添加购物车成功！");
                        request.getRequestDispatcher("/GoodXQ?ID=" + goodsId).forward(request, response);
                    }else {
                        request.setAttribute("addcar", "添加购物车失败!");
                        request.getRequestDispatcher("/GoodXQ?ID=" + goodsId).forward(request, response);
                    }
                } else {
                    Good good = goodService.allGoodXqService(goodsId);
                    int goodId = good.getGoodId();
                    String goodName = good.getGoodName();
                    String goodPic = good.getGoodPic();
                    Double goodPrice = Double.valueOf(good.getGoodPrice());
                    int goodQuantity = 1;
                    Double goodTotal = goodPrice * goodQuantity;
                    if (carService.addCarService(goodId, userName, goodName, goodPrice, goodPic, goodQuantity, goodTotal) > 0) {
                        Good goods=goodService.allGoodXqService(goodId);
                        String goodDes=goods.getGoodDes();
                        Integer i = (int)((Math.random()*9+1)*1000000);
                        String id="23"+i;
                        Integer orderId= Integer.valueOf(id);
                        System.out.println(orderId);
                        String orderState="未付款";
                        Double totalPrice=goodTotal;
                        String createTime="null";
                        String receiptName=userName;
                        request.setAttribute("addcar", "添加购物车成功！");
                        if(orderService.addOrderService(orderId,userName,orderState,goodId,goodPic,goodDes,totalPrice,
                                goodQuantity,
                                goodName,
                                createTime,receiptName)>0){
                            System.out.println("创建订单成功");
                            request.getRequestDispatcher("/GoodXQ?ID=" + goodId).forward(request, response);
                        }else {
                            System.out.println("创建订单失败");
                        }
                    } else {
                        request.setAttribute("addcar", "添加购物车失败!");
                        request.getRequestDispatcher("/GoodXQ?ID=" + goodId).forward(request, response);
                    }
                }
            }else if(flag.equals("del")){
            int delGoodId= Integer.parseInt(request.getParameter("goodId"));
            if (carService.delcarService(delGoodId,userName)) {
                request.getRequestDispatcher("/Car?action=all").forward(request, response);
            } else {
                request.setAttribute("delcar","删除失败");
                request.getRequestDispatcher("/car.jsp").forward(request, response);
            }
            Order order=orderService.allOrderXqService(userName,delGoodId);
            int orderId=order.getOrderId();
            if(orderService.delOrderService(orderId)){
                System.out.println("订单删除成功");
            }else {
                System.out.println("订单删除失败!");
            }
            }

    }
}
