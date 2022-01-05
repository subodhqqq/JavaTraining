<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 02/01/2022
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listof user</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%@ include file="../includes/sidebar.jsp"%>
<div class="container">


    <div class="table-responsive">
        <table class="">
            <tr>
                <th>ID</th>
                <th>USername</th>
                <th>Full name</th>
                <th>password</th>

            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>

                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.fname}</td>
                    <td>${user.password}</td>
                    <td><a href="user?page=userdetails&id=${user.id}">View Details</a> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <a href="user?page=newcase">Add</a>

</div>
</body>
</html>
