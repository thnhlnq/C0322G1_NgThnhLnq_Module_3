<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 27/06/2022
  Time: 9:57 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product</h2>
<form method="post" action="/display_discount">
    <label>Product Description: </label><br/>
    <label><input type="text" name="productDescription" placeholder="Mô tả sản phẩm"></label><br/>
    <label>List Price: </label><br/>
    <label><input type="text" name="listPrice" placeholder="0"></label><br/>
    <label>Discount Percent: </label><br/>
    <label><input type="text" name="discountPercent" placeholder="0"></label><br/>
    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
