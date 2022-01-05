<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%@ include file="../includes/sidebar.jsp"%>
<div class="container">
    <form action="user?page=editUser" method="post">
        <label FOR="ID">ID</label>
        <input type="hidden" name="id" value="${user.id}"><br>
        <label FOR="username">UserName</label>
        <input type="text" name="username" value="${user.username}"><br>
        <label FOR="fname">full Name</label>
        <input type="text" name="fname" value="${user.fname}"><br>
        <label FOR="password">Password</label>
        <input type="password" name="password" value="${user.password}"><br>
        <input type="submit" value="edit" name="submit">
    </form>
</div>

</body>
</html>