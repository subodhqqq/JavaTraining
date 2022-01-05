<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 27/12/2021
  Time: 07:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>User</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  </head>
  <body>
  <form action="user" method="post">
    <input type="hidden" name="page" value="LOGIN">
    <label for="uesrname">username</label>
    <input type="text" name="username" placeholder="enter your username"><br>
    <label for="password">password</label>
    <input type="password" name="password" placeholder="enter your password"><br>

    <input type="submit" value ="LOGIN">
    <a href="user?page=newCase">Register</a>


  </form>
  </body>
</html>
