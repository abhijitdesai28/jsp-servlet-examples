<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <%
         String myname=(String) session.getAttribute("name_Key");
       %>
      <h3>welcome :<%=myname %></h3>
      
      <a href="home.jsp">HOME</a> &nbsp;&nbsp;
      <a href="about-us.jsp">About us</a> &nbsp;&nbsp;
      <a href="Logout">Logout</a> &nbsp;&nbsp;

</body>
</html>