<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 28/06/2022
  Time: 8:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find By Name Product</title>
    <style>
        .back {
            text-decoration: none;
            color: black;
        }

        a:hover {
            color: red;
        }
    </style>
</head>
<body>
<h1>Find By Name Product</h1>
<p><c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if></p>
<form method="post">
    <fieldset>
        <legend><h4>Find By Name</h4></legend>
        <table>
            <tr>
                <td>Enter Name Find</td>
                <td><input type="text" name="find" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Find"></td>
            </tr>
        </table>
    </fieldset>
</form>
<p><a class="back" href="/products">Back To Product List</a></p>
</body>
</html>
