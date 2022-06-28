<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 27/06/2022
  Time: 3:29 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));

    float vnd = rate * usd;
%>
<h3>Rate: <%=rate%></h3>
<h3>USD: <%=usd%></h3>
<h3>VND: <%=vnd%></h3>
</body>
</body>
</html>
