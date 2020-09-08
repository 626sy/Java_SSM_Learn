<%--
  Created by IntelliJ IDEA.
  User: 22864
  Date: 2020/9/7
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数绑定--%>
<a href="param/testParam?username=hehe&password=123456">请求参数绑定</a>

<form action="/param/saveAccount" method="post">
    姓名： <input type="text" name="username">
    密码： <input type="text" name="password">
    金额： <input type="text" name="money">
    用户姓名： <input type="text" name="user.uname">
    用户年龄： <input type="text" name="user.age">
    <input type="submit" value="提交">
</form>

<hr>

<form action="/param/saveAccount" method="post">
    姓名： <input type="text" name="username">
    密码： <input type="text" name="password">
    金额： <input type="text" name="money">
    用户姓名： <input type="text" name="list[0].uname">
    用户年龄： <input type="text" name="list[0].age">
    用户姓名： <input type="text" name="map['first].uname">
    用户年龄： <input type="text" name="map['first].age">
    <input type="submit" value="提交">
</form>

<br>
<form action="/param/saveUser" method="post">

    用户姓名： <input type="text" name="uname">
    用户年龄： <input type="text" name="age">
    用户生日： <input type="text" name="date">
    <input type="submit" value="提交">
</form>

<a href="/param/testServlet?hehe='xixi'">servlet原生API</a>
</body>
</html>
