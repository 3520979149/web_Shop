<!-- <%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/4/7
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>我的订单</title>
    <link rel="stylesheet" href="css/order.css">
    <link rel="stylesheet" href="css/public.css">
</head>
<body>
<div class="head">
    <div class="shouye_head">
        <a href="index.jsp">商城首页</a>
        <a href="/Car?action=all">返回购物车</a>
        <span>我的订单</span>
    </div>
</div>
<div>
    ${orderunll}
</div>
<c:forEach var="order" items="${orders}">
    <div class="order">
        <a href="/orderXq?orderId=${order.orderId}"><img src="${order.goodPic}" width="120px" height="110px"></a>
        <span class="name">${order.goodName}</span>
        <span class="orderId">订单号:${order.orderId}<c:if test="${order.orderState=='已付款'}">已付款</c:if>
            <c:if test="${order.orderState=='已收货'}">已收货</c:if></span>
        <p class="des">${order.goodDes}</p>
        <span class="price">$${order.totalPrice} &nbsp; x${order.goodQuantity}</span>
        <div class="button">
            <a href="/order?action=del&id=${order.orderId}"><input type="button" value="点击退货" name=""></a>
            <a href="/GoodXQ?ID=${order.goodId}"><input type="button" value="再次购买" name=""></a>
        </div>
    </div>
</c:forEach>
</body>
</html>
