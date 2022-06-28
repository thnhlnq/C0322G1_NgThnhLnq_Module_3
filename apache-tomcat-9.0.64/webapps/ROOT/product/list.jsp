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
    <title>Product List</title>
    <style>
        a:hover {
            color: red;
        }
    </style>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<body>
<h1>Products</h1>
<table class="container-fluid table table-striped table-hover">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Producer</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td><a class="text-decoration-none text-dark link-danger" href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td><a class="text-decoration-none text-dark link-danger" href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a class="text-decoration-none text-dark link-danger" href="/products?action=delete&id=${product.getId()}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<p><a class="text-decoration-none text-dark link-danger" href="/products?action=create">Create New Product</a></p>
<p><a class="text-decoration-none text-dark link-danger" href="/products?action=find">Find Product</a></p>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</html>
