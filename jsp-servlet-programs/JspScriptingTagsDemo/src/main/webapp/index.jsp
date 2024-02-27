<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
    
    <%!
      //declaration tag used to declare variable and method
       int a=10;
       String name="abhi";
       int square()
       {
    	   return a*a;
       }
    %>
    
    <%
      //scrptlet tag is used to print ,invoke method,declare variable,use if else ,for 
       out.println("a :"+a);
       out.println("name :"+name);
       out.println(square());
       
       int b=20;
       if(b<100)
       {
    	   out.println("b is smaller than 100");
       }
       else{
    	   out.println("b is greater than 100");
       }
       
       for(int i=1;i<=5;i++){
    	   out.println(i);
       }
       
      // request.getParameter("");'
    %>
    
    <%=
       //expression tag is used to print bcz when we print in scriplet tag then it is more line 
       a
    %>
    <%= name %>
    <%= square() %>
    <%= Math.random() %>
    
    

</body>
</html>