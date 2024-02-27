package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myName = request.getParameter("name");
		String myPassword =request.getParameter("pass");
		
		if(myName.equals("abhi") && myPassword.equals("abhi123"))
		{
			System.out.println("login successful");
		}
		else {
			System.out.println("invalid login");
		}
			
		
		
	}

}
