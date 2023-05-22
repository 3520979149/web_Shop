<%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/3/29
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的虎淘</title>
    <link rel="stylesheet" href="css/user.css">
    <link rel="stylesheet" href="css/public.css">
</head>
<body>
  <!-- 导航栏 -->
  <div class="head">
    <div class="shouye_head">
        <a href="index.jsp">商城首页</a>
      <a href="javascript:history.back(-1)" class="con2_a2">返回</a>
    </div>
  </div>
  <!-- 个人信息 -->
  <div class="user">
    <div class="user_nav">
      <a href="index.jsp">首页</a>
      <a href="/Car?action=all">我的购物车</a>
      <a href="/order?action=all">我的订单</a>
      <a href="/exit">退出登录</a>
    </div>
    <div class="user_body">
      <div class="user_head">
        <img src="images/user.png" >
        <span user_name>${USER}</span>
      </div>
      <!-- 钱包 -->
      <!-- 我的订单 -->
      <div class="myorder">
        <div class="order_head">我的订单</div>
        <div class="order_body">
          <span><img src="images/order1.png" width="90px"><a href="/order?action=all">待收货</a></span>
          <span><img src="images/order2.png" width="90px"><a href="/order?action=all">待付款</a></span>
          <span><img src="images/order3.png" width="90px"><a href="/order?action=all">待评价</a></span>
          <span><img src="images/order4.png" width="90px"><a href="/order?action=all">售后</a></span>
          <span><img src="images/order5.png" width="90px"><a href="/order?action=all">全部订单</a></span>
        </div>
      </div>
    </div>
</div>
</body>
</html>
