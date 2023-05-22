<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/1/4
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
<%--        <meta http-equiv="refresh" content="1">//自动刷新--%>
        <title>商城购物车界面</title>
        <link rel="stylesheet" type="text/css" href="css/public.css"/>
        <link rel="stylesheet" type="text/css" href="css/carts.css"/>
        <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
<%--        <script src="js/cart.js" type="text/javascript" charset="utf-8"></script>--%>
    </head>
    <body>
        <div class="head">
            <div class="shouye_head">
                <a href="index.jsp">商城首页</a>
                <a href="javascript:history.back(-1)" class="con2_a2">返回</a>
            </div>
        </div>
        <div class="cart">
            <div class="cart-head">
                <div class="column g-images">图片</div>
                <div class="column g-goodsname">商品名称</div>
                <div class="column g-price">单价</div>
                <div class="column g-quantity">数量</div>
                <div class="column g-sum">小计</div>
                <div class="column g-action">操作</div>
                <div><a href="javascript:location.reload()">刷新</a></div>
            </div>
            <div>${carnull}</div>
            <c:forEach items="${usercar}" var="good">
                <div class="carts-goods">
                    <div class="cell c-images">
                        <a href="/GoodXQ?ID=${good.goodId}"
                           title="${good.goodName}"><img src="${good.goodPic}"></a>
                    </div>
                    <div class="cell c-goodsname">${good.goodName}</div>
                    <div class="cell c-price">
                        <span>￥${good.goodPrice}</span>
                    </div>
                    <div class="cell c-quantity">
                        <input type="text" value="${good.goodQuantity}" class="text_num">
                    </div>
                    <div class="cell c-sum">
                        <span>￥</span>
                        <div class="c-sum_num">${good.goodTotal}</div>
                    </div>
                    <div class="cell c-action">
                        <a href="/Car?action=del&goodId=${good.goodId}&userName=${good.userName}" class="remove">移除商品
                        </a>
                    </div>
                </div>
            </c:forEach>


        </div>
        <div class="payment">
            <div class="cart-pay">
                <div class="pay-left">

                    <div class="goods_num">
                        您的购物车有:
                        <span><%=request.getAttribute("total")==null?0:request.getAttribute("total")%></span>
                        件商品
                    </div>
                </div>
                <div class="pay-right">
                    <div class="right_jie">
                        <div class="btn">
                            <a href="/pay.jsp" id="Js">结算</a>
                        </div>
                        <script>
                            var user = document.getElementById("Js");
                            user.addEventListener('click', function (event) {
                                //阻止a标签默认行为
                                event.preventDefault();
                                //判断条件
                                if (${empty usercar}) {
                                    //使用window.location.href跳转
                                    window.location.href = "/Car?action=all";
                                } else {
                                    window.location.href = "/pay.jsp";
                                }
                            });
                        </script>
                        <div class="price-sum">
                            <div class="price-show">总价是：</div>
                            <div class="show-money">
                                ￥<%=request.getAttribute("TotalPrice")==null?0.00:request.getAttribute("TotalPrice")%>元
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">

        </script>
    </body>
</html>
