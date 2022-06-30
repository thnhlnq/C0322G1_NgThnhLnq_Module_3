<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 30/06/2022
  Time: 3:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
<h1>Are You Sure ?</h1>
<form method="post">
    <fieldset>
        <legend><h4>User Information</h4></legend>
        <table>
            <tr>
                <td>Name</td>
                <td>${requestScope['user'].getName()}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${requestScope['user'].getEmail()}</td>
            </tr>
            <tr>
                <td>Country</td>
                <td>${requestScope['user'].getCountry()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete User"></td>
            </tr>
        </table>
    </fieldset>
</form>
<p><a class="back" href="/users">Back To User List</a></p>
</body>
</html>
