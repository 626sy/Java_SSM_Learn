<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>欢迎来到Java9 银行</h2>
<a href="account/findAll">查询所有账户</a>

<h3>添加账户</h3>
<form action="account/save">
    姓名： <input type="text" name="username"> <br>
    金额： <input type="text" name="usermoney"> <br>
    <input type="submit" value="保存">
</form>

<img src="images/baidu.png">

<h3>更新账户</h3>
<form action="account/update">
    id: <input type="text" name="id"> <br>
    姓名: <input type="text" name="name"> <br>
    金额: <input type="text" name="money"> <br>
    <input type="submit" value="更新">
</form>

</body>
</html>
