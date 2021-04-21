<%--
  Created by IntelliJ IDEA.
  User: krmal
  Date: 3/21/2021
  Time: 8:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Getting value from the session</title>
</head>
<body>
<%
    String name=(String)session.getAttribute("userName");
    out.print("Hello User: You have entered the name: "+name);
%>
</body>
</html>
