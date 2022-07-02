<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 28/06/2022
  Time: 2:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting Product</title>
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
<h1>Delete Product</h1>
<form method="post">
    <h3>Are You Sure ?</h3>
    <fieldset>
        <legend><h4>Product Information</h4></legend>
        <table>
            <tr>
                <td>Name</td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Price</td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Description</td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>Producer</td>
                <td>${requestScope["product"].getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
<p><a class="back" href="/products">Back To Product List</a></p>
</body>
</html>
