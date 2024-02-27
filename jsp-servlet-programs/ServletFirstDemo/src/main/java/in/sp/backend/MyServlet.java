package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException
	{
		//to print on browser
		PrintWriter out = response.getWriter();
		out.print("im in (doGet()) method for browser");
		System.out.println("im in (doGet()) method for console");
		
	}

}
