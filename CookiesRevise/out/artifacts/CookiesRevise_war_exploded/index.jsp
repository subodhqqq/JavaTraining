<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 23/12/2021
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/LoginServlet" method="post">
    <label for="username">UserName</label>
    <input type="text" name="username" placeholder="Enter the your name"><br>
    <label for="password">Password</label>
    <input type="password" name="password" placeholder="Enter your password"><br>
    <input type="submit" value="Login">
  </form>
  </body>
</html>
