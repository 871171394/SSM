<%--
  Created by IntelliJ IDEA.
  User: 87117
  Date: 2019/11/19
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/findAll">测试</a>

<h3>保存</h3>
<form action="account/save" method="post">
    姓名:<input type="text" name="name"><br>
    金额:<input type="text" name="money">
    <input type="submit" value="保存">
</form>
</body>
</html>
