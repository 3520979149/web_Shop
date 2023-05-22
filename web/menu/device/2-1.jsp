<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/1/5
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title >从MySQL数据库中读出student表</title>
</head>
<body>
    <table border="1" cellspacing="0px" cellpadding="0px">
        <tr>
            <td width="100" user_id="title">账号</td>
            <td width="100" username="title">用户名</td>
            <td width="100" email="title">电子邮箱</td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
        </tr>
</table>
</body>
</html>


