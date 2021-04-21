<%--
  Created by IntelliJ IDEA.
  User: krmal
  Date: 3/21/2021
  Time: 8:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passing the login value to a session variable</title>
</head>
<body>
<%
    String uname=request.getParameter("userName");
    out.print("Welcome "+ uname);
    session.setAttribute("userid",uname);
%>
<a href="usersession.jsp">This is the page redirect for session output </a>
</body>
</html>
