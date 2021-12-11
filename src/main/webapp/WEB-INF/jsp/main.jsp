<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<table width="50%" align="center" border="1">
    <tr>
    <td>用户</td>
    <td>用户名</td>
    <td>操作</td>
    </tr>
    <c:forEach items="${users} var=“i”">
        <tr>
            <td>${}</td>
            <td>用户名</td>
            <td>操作</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
