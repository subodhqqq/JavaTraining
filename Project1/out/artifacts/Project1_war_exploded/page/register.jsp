<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 02/01/2022
  Time: 07:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<form  action ="user?page=register" method="post" onsubmit="checkValidation()">
    <input type="hidden" name="page" value="register">

<label for="uesrname">username</label>
<input type="text"  name="username" placeholder="enter your username" id="UserName"><br>
<label for="fullname">Fullname</label>
<input type="text"  name="fname" placeholder="enter your full name" id="Full_Name"><br>
<label for="password">password</label>
<input type="password"  name="password" placeholder="enter your password"><br>
<a href="user?page=index">aleardy login </a>

<input type="submit" value ="register">
</form>>
<script src="../js/script.js"></script>
</body>
</html>
