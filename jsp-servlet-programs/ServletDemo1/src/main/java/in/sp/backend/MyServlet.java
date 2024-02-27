package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myName = request.getParameter("name1");
		String myEmail = request.getParameter("email");
		
		//with syso it print on console
		System.out.println("Name:"+myName);
		System.out.println("Email:"+myEmail);
		
		//to print on browser
		PrintWriter out=response.getWriter();
		out.println("Name:"+myName);
		out.println("Email:"+myEmail);
		
	}

}
