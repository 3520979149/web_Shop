<%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/4/7
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情</title>
    <link rel="stylesheet" href="css/orderXq.css">
    <link rel="stylesheet" href="css/public.css">
</head>
<body>
<div class="head">
    <div class="shouye_head">
        <a href="index.jsp">商城首页</a>
        <a href="/order?action=all">返回我的订单</a>
        <span>订单详情</span>
    </div>
</div>
<div class="orderXq">
    <h1>订单详情</h1>
    <img src="${goodPic}">
    <ul class="lis">
        <li>订单名称:${goodName}</li>
        <li>订单编号:${orderId}</li>
        <li>订单状态:${orderState}</li>
        <li>下单时间:${createTime}</li>
        <li>收货地址:${address}</li>
        <li>收货人:${userName}</li>
    </ul>
    <div class="button">
        <a href="GoodXQ?ID=${goodId}"><input type="button" value="商品详情"></a>
        <a href="/orderDel?orderId=${orderId}"><input type="button" value="确认收货"></a>
    </div>
</div>
</body>
</html>
