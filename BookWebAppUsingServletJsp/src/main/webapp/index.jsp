<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="bookServlet" method="post">
         <label for="fname">Book Id:</label>
        <input type="text" name="bookId"></br> </br></br>
        <label for="fname">Book Name:</label>
        <input type="text" name="bookName"></br></br></br>
        <label for="fname">Book Price:</label>
        <input type="text" name="bookPrice"></br></br></br>
         <input type="submit" value="Submit">
     </form>

</body>
</html>