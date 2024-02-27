package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myemail = request.getParameter("email1");
		String mypass= request.getParameter("pass1");
		
		PrintWriter out =response.getWriter();
		
		if(myemail.equals("abhi@gmail.com") && mypass.equals("abhi123")) {
			//request.setAttribute("name_key","ramesh sursh");
			RequestDispatcher rd = request.getRequestDispatcher("/Profile.jsp");
			rd.forward(request, response);
			
		}else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red'>email id and password didnt match<h3/>");
			RequestDispatcher rd= request.getRequestDispatcher("/index.html");
			//rd.forward(request, response);
			rd.include(request, response);
		}
		
	}

}
