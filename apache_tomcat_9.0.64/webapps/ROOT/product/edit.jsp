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
    <title>Edit Product</title>
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
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<form method="post">
    <fieldset>
        <legend><h4>Product Information</h4></legend>
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="text" name="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="description" value="${requestScope["product"].getDescription()}"></td>
            </tr>
            <tr>
                <td>Producer</td>
                <td><input type="text" name="producer" value="${requestScope["product"].getProducer()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
<p><a class="back" href="/products">Back To Product List</a></p>
</body>
</html>
