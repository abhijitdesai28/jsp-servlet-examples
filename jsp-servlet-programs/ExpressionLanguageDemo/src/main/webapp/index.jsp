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
      request.setAttribute("request_name", "xyz");
      //out.println(request.getAtteribute("request_name"));
   %>
   
   <h3>Welcome :${requestScope.request_name}</h3>
   
   <% 
     session.setAttribute("session_name", "programing");
     // out.println(session.getAttribute("session_name"));
     %>
     
     <h3>CompanyName: ${session_name}</h3>

</body>
</html>