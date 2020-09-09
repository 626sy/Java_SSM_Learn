<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 22864
  Date: 2020/9/8
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>查询所有账户</h4>
<c:forEach items="${list}" var="account">
    ${account.name} <br>
    ${account} <br>

</c:forEach>




</body>
</html>
