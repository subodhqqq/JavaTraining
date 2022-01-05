<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 03/01/2022
  Time: 07:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Userdetails</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<%@ include file="../includes/sidebar.jsp"%>
<div class="container">


    <div class="table-responsive">
        <table class="table">
            <tr>
                <th>ID</th>
                <td>${user.id}</td>
            </tr>
            <tr>
                <th>Username</th>
                <td>${user.username}</td>
            </tr>

            <tr>

                <th>Full name</th>
                <td>${user.fname}</td>
            </tr>
        <tr>
                <th>password</th>
                <td>${user.password}</td>
        </tr>

            </tr>
            <tr>
                <td><a href="user?page=userEdit&id=${user.id}">Edit</a></td>
                <td><a href="user?page=deleteUser&id=${user.id}">Delete</a></td>

            </tr>
            <%--<c:forEach items="$(userList)" var="user">--%>
                <%--<tr>--%>

                    <%--<td>$(user.id)</td>--%>
                    <%--<td>$(user.username)</td>--%>
                    <%--<td>$(user.fname)</td>--%>
                    <%--<td>$(user.password)</td>--%>

                    <%--<td><a href="user?page=userdetails&id=${user.id}"></a> View Details </td>--%>

                <%--</tr>--%>


            <%--</c:forEach>--%>
            <%--<a href="user?page=newcase">Add</a>--%>

        </table>
    </div>
</div>
</body>
</html>
