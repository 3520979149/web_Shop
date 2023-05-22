<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/1/6
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

    <table border="1px" cellpadding="0px" cellspacing="0px">
            <tr>
                <td  goods_id="title">商品编号</td>
                <td  goods_name="title">商品名称</td>
                <td  category="title">商品类别</td>
                <td  unitprice="title">单价</td>
                <td  stock="title">库存数量</td>
                <td  details="title">详细介绍</td>
                <td>操作</td>
            </tr>
        <c:forEach var="good" items="${goods}">
        <tr>
                <td width="100px" height="45px">${good.goodId}</td>
                <td width="100px" height="45px">${good.goodName}</td>
                <td width="100px" height="45px">${good.goodCategory}</td>
                <td width="100px" height="45px">${good.goodPrice}</td>
                <td width="100px" height="45px">${good.goodStock}</td>
                <td width="950px">${good.goodDes}</td>
                <td><a href="">修改</a></td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
