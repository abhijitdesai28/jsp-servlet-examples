<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="regForm" method="post"></form>
    Name : <input type="text" name="name" /><br/><br/>
    Email : <input type="text" name="email" /><br/><br/>
    PassWord : <input type="password" name="pass1" /><br/><br/>
    Gender :<input type="radio" name="gender1" value="male"/>Male<input type="radio" name="gender1"/>
              Fe-Male<input type="radio" name="gender1" value="female"/><br/>
    City :<select name="city1">
               <option>sELECT CITY<option>
               <option>pune</option>
               <option>mumbai</option>
               <option>banglore/<option>
                <option>delhi</option>        
         </select><br/><br/>
       <input type="submit" value="Register"> 
    

</body>
</html>