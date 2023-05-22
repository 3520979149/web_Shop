<%--
  Created by IntelliJ IDEA.
  User: chc
  Date: 2023/3/27
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>虎淘乐购</title>
    <link rel="stylesheet" href="css/Home_page.css">
    <%--  首页整体样式  --%>
    <%--    <link rel="stylesheet" type="text/css" href="css/search.css">&lt;%&ndash;  首页搜索框样式  &ndash;%&gt;--%>
    <link rel="stylesheet" type="text/css" href="css/Commodity_navigation_bar.css">
    <%--  商品导航栏样式  --%>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/shouye.css"/>
    <link rel="stylesheet" href="css/lunbo.css">
    <script src="js/lunbo.js"></script>
    <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/front_page.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<header class="head">
    <div class="head_zi">
        <div class="huan">
            欢迎进入虎淘购物商城
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
            <input type="text" class="text" name="search">
            <button type="submit"><img src="images/搜索图标.png" width="30px"></button>
        </form>
    </div>
</div>
<div class="shop">
    <%--轮播图--%>
    <div id="max">
        <div class="re">
            <ul>
                <li><a href="/search?search"><img src="images/0.jpg" width="1100px" alt=""></a></li>
                <li><a href="/search?search"><img src="images/1.jpg" width="1100px" alt=""></a></li>
                <li><a href="/search?search"><img src="images/2.jpg" width="1100px" alt=""></a></li>
                <li><a href="/search?search"><img src="images/3.jpg" width="1100px" alt=""></a></li>
                <li><a href="/search?search"><img src="images/4.jpg" width="1100px" alt=""></a></li>
            </ul>
            <ol>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ol>
        </div>
    </div>

    <%--  商品推荐  --%>
    <div class="Product_recommendation"></div>
    <%--  食品板块  --%>
    <div class="nei">
        <div class="box_tit w">
            <%--  食品导航栏   --%>
            <div>
                <ul class="ul_dhl">
                    <h2>食品</h2>
                    <li class="li_dhls"><a class="active_a" href="/search?search">更多>></a></li>
                </ul>
            </div>
            <%--  食品  --%>
<%--                水果--%>
            <div class="nei_pohot">
                <ul>
                    <c:forEach var="good" items="${goodsSg}">
                        <li class="phone_tu">
                            <a href="/GoodXQ?ID=${good.goodId}">
                                <div>
                                    <div class="ph">
                                        <img src="${good.goodPic}" width="320px" height="184px">
                                    </div>
                                    <div class="na">${good.goodName}</div>
                                    <p><b>￥</b>${good.goodPrice}</p>
                                </div>
                            </a>
                        </li>
                    </c:forEach>

                </ul>
            </div>

        </div>
        <%--       生活用品板块         --%>
        <div class="box_tit w">
            <%--  生活用品导航栏   --%>
            <div>
                <ul class="ul_dhl">
                    <h2>生活用品</h2>
                    <li class="li_dhls"><a class="active_a" href="/search?search">更多>></a></li>
                </ul>
            </div>
            <%--  生活用品  --%>
            <div class="nei_pohot">
                <ul>
                        <c:forEach var="good" items="${goodsXh}" >
                            <li class="phone_tu">
                                <a href="/GoodXQ?ID=${good.goodId}">
                                    <div>
                                        <div class="ph">
                                            <img src="${good.goodPic}" width="320px" height="184px">
                                        </div>
                                        <div class="na">${good.goodName}</div>
                                        <p><b>￥</b>${good.goodPrice}</p>
                                    </div>
                                </a>
                            </li>
                        </c:forEach>


                </ul>
            </div>
        </div>
        <%--        家具板块            --%>
        <div class="box_tit w">
            <%--  家具导航栏   --%>
            <div>
                <ul class="ul_dhl">
                    <h2>家具</h2>
                    <li class="li_dhls"><a class="active_a" href="/search?search">更多>></a></li>
                </ul>
            </div>
            <%--  家具  --%>
<%--                家电--%>
            <div class="nei_pohot">
                <ul>
                    <c:forEach var="good" items="${goodsJd}" >
                        <li class="phone_tu">
                            <a href="/GoodXQ?ID=${good.goodId}">
                                <div>
                                    <div class="ph">
                                        <img src="${good.goodPic}" width="320px" height="184px">
                                    </div>
                                    <div class="na">${good.goodName}</div>
                                    <p><b>￥</b>${good.goodPrice}</p>
                                </div>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <%--           数码产品板块             --%>
        <div class="box_tit w">
            <%--  数码产品导航栏   --%>
            <div>
                <ul class="ul_dhl">

                    <h2>数码产品</h2>
                    <li class="li_dhls"><a class="active_a" href="/search?search">更多>></a></li>
                </ul>
            </div>
            <%--  数码产品  --%>
            <div class="nei_pohot">
                <ul>
                    <c:forEach var="good" items="${goodsSj}">
                        <li class="phone_tu">
                            <a href="/GoodXQ?ID=${good.goodId}">
                                <div>
                                    <div class="ph">
                                        <img src="${good.goodPic}" width="320px" height="184px">
                                    </div>
                                    <div class="na">${good.goodName}</div>
                                    <p><b>￥</b>${good.goodPrice}</p>
                                </div>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<%--  右侧导航栏--%>
<div class="nav">
    <ul>
        <li class="current">食品</li>
        <li>生活用品</li>
        <li>家具</li>
        <li>数码产品</li>
        <div class="back">返回顶部</div>
    </ul>
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
