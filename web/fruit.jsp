<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/1/4
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <meta charset="UTF-8">
        <title>商品详情</title>
        <link rel="stylesheet" type="text/css" href="css/public.css"/>
        <link rel="stylesheet" type="text/css" href="css/fruit.css"/>
        <link rel="stylesheet" type="text/css" href="css/Home_page.css"/>

    </head>
    <body>
    <header class="head">
        <div class="head_zi">
            <a href="index.jsp" class="logo"><img src="images/logo.gif" width="160px" height="60px"></a>
            <div class="car">
                <a href="/Car?action=all"><img src="images/购物车.png" height="28px">
                    <span>购物车</span>
                </a>
            </div>
            <div class="head_user">
                <a id="userTP" href="index.jsp"><img src="images/user.png" width="40px" height="40px"></a>
                <span class="header_three" id="Name">${USER}</span>
            </div>
        </div>

    </header>
    <!--搜索框-->
    <div class="search_kuang">
        <div class="search">
            <form action="/search" method="post">
                <input type="text" class="text" name="search" >
                <button type="submit"><img src="images/搜索图标.png" width="30px"></button>
            </form>

        </div>
    </div>
        <div class="xi_nav">
            <div class="wrap">
                <ul class="menu-list">
                    <li class="menu"><a href="index.jsp">首页</a></li>
                </ul>
            </div>
        </div>

    <div class="con">
        <div class="con1">
            <img src="${goodXq.goodPic}" width="350px" height="350px">
        </div>
        <div class="con2">
            <p class="con2_p1">${goodXq.goodName}</p>
            <p class="con2_p2">￥${goodXq.goodPrice}</p>
            <p class="con2_p3">${goodXq.goodDes}</p>
            <a href="/Car?action=add&carID=${goodXq.goodId}" class="con2_a1">加入购物车</a>
            <a href="javascript:history.back(-1)"
               class="con2_a2" id="back">返回</a>
            <span>${add}</span>

        </div>
    </div>

    </body>
</html>
