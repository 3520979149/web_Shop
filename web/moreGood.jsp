<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- <%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/4/8
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<html>
<head>
    <title>商品菜单</title>
    <link rel="stylesheet" href="css/public.css">
    <link rel="stylesheet" href="css/moreGood.css">
</head>
<body>
<header class="head">
    <div class="head_zi">
        <div class="huan">
            <a href="/index.jsp">首页</a>
        </div>
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
    <script>
        var user = document.getElementById("userTP");
        user.addEventListener('click', function (event) {
            //阻止a标签默认行为
            event.preventDefault();
            //判断条件，比如判断当前用户是否登录
            if (${empty USER}) {
                //使用window.location.href跳转
                window.location.href = "/login.jsp";
            } else {
                window.location.href = "/User.jsp?action=${USER}";
            }
        });
    </script>
</header>
<!--搜索框-->
<div class="search_kuang">
    <div class="search">
        <a href="index.jsp" class="logo"><img src="images/logo.gif" width="160px" height="70px"></a>
        <form action="/search" method="post">
            <input type="text" class="text" name="search" placeholder="${search}">
            <button type="submit"><img src="images/搜索图标.png" width="30px"></button>
        </form>
    </div>
</div>
<!-- 商品显示 -->
<div class="shop">
    <div>${nullgood}</div>
    <ul>
        <c:forEach var="good" items="${goods}">
            <li class="phone_tu">
                <a href="/GoodXQ?ID=${good.goodId}">
                    <div>
                        <div class="ph">
                            <img src="${good.goodPic}" width="320px" height="184px">
                        </div>
                        <div class="na">${good.goodName}</div>
                        <p>$${good.goodPrice}</p>
                    </div>
                </a>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
