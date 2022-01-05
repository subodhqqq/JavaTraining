<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 02/01/2022
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div>

    <li>
        <a href="user?page=home">Dashbloard</a>
    </li>
    <li>
        <a href="user?page=listUser">List of usre</a>
    </li>
    <li>
        <a href="user?page=logout">logout</a>
    </li>


        <%--<nav class="navbar navbar-expand-lg navbar-light bg-light">--%>
            <%--<a class="navbar-brand" href="user?page=home">Dashboard</a>--%>
            <%--<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">--%>
                <%--<span class="navbar-toggler-icon"></span>--%>
            <%--</button>--%>

            <%--<div class="collapse navbar-collapse" id="navbarSupportedContent">--%>
                <%--<ul class="navbar-nav mr-auto">--%>
                    <%--<li class="nav-item active">--%>
                        <%--<a class="nav-link" href="user?page=listUser">List <span class="sr-only">(current)</span></a>--%>
                    <%--</li>--%>
                    <%--<li class="nav-item">--%>
                        <%--<a class="nav-link" href="user?page=logout">logout</a>--%>
                    <%--</li>--%>

                <%--</ul>--%>
                <%--<form class="form-inline my-2 my-lg-0">--%>
                    <%--<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">--%>
                    <%--<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>--%>
                <%--</form>--%>
            <%--</div>--%>
        <%--</nav>--%>
</div>
</body>
</html>
