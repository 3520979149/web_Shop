<!-- <%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/4/7
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> -->
<html>
<head>
    <title>支付页面</title>
    <link rel="stylesheet" href="/css/public.css">
    <link rel="stylesheet" href="/css/pay.css">
</head>
<body>
<!-- 导航栏 -->
<div class="head">
    <div class="shouye_head">
        <a href="index.jsp">商城首页</a>
        <a href="javascript:history.back(-1)">返回购物车</a>
    </div>
</div>
<div class="pay">
    <span>扫码完成支付</span>
    <br><br>
    <img src="images/pay.png" alt="">
    <div class="font">
        <p><a href="/pay">支付完成后，点击返回订单页面</a></p>
    </div>
</div>
<div class="footer">
    <div class="translate">
        <div class="footer-links">
            <h5>购物指南</h5>
            <ul>
                <li><a href="#">购物流程</a></li>
                <li><a href="#">会员介绍</a></li>
                <li><a href="#">生活旅行</a></li>
                <li><a href="#">常见问题</a></li>
                <li><a href="#">联系客服</a></li>
            </ul>
        </div>
        <div class="footer-links">
            <h5>支付方式</h5>
            <ul>
                <li><a href="#">信用卡</a></li>
                <li><a href="#">货到付款</a></li>
                <li><a href="#">在线付款</a></li>
                <li><a href="#">分期付款</a></li>
            </ul>
        </div>
        <div class="footer-links">
            <h5>售后服务</h5>
            <ul>
                <li><a href="#">售后政策</a></li>
                <li><a href="#">退款说明</a></li>
                <li><a href="#">返修/退换货</a></li>
            </ul>
        </div>
        <div class="footer-links">
            <h5>帮助中心</h5>
            <ul>
                <li><a href="#">账户管理</a></li>
                <li><a href="#">自助服务</a></li>
                <li><a href="#">订单操作</a></li>
                <li><a href="#">服务网点</a></li>
                <li><a href="#">授权体验店/专区</a></li>
            </ul>
        </div>
        <div class="footer-links">
            <h5>关于我们</h5>
            <ul>
                <li><a href="#">新浪微博</a></li>
                <li><a href="#">官方微信</a></li>
                <li><a href="#">联系我们</a></li>
                <li><a href="#">加入我们</a></li>
                <li><a href="#">公益基金会</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
