<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 02/01/2022
  Time: 07:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <%@ include file="../includes/sidebar.jsp"%>
    <H1 >Welcome <%= session.getAttribute("username") %></H1>
</div>
</body>
</html>
