<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 29/06/2022
  Time: 3:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <nav class="navbar bg-light">
        <div class="container-fluid">
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search By Country" name="findCountry">
                <input class="btn btn-outline-success" type="submit" name="action" value="Search">
            </form>
        </div>
    </nav>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${requestScope['listUser']}" var="user">
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getCountry()}</td>
                <td>
                    <a href="/users?action=edit&id=${user.getId()}">Edit</a>
                    <a href="/users?action=delete&id=${user.getId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
