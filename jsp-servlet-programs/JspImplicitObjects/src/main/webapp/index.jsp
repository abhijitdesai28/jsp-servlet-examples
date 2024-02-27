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
      String name="abhi";
      out.println(name);
   %>
   
   <%
      session.setAttribute("session_name", "abhi");
   %>
   
   <form action="">
       <input type="text" name="name1" placeholder="Enter_name"/>
       <input type="submit" value="click me" />
   </form>

</body>
</html>