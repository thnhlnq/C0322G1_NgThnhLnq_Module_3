<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 27/06/2022
  Time: 3:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="converter.jsp" method="post">
    <label>Rate: </label><br/>
    <label><input type="text" name="rate" placeholder="RATE" value="22000"/></label><br/>
    <label>USD: </label><br/>
    <label><input type="text" name="usd" placeholder="USD" value="0"/></label><br/>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
