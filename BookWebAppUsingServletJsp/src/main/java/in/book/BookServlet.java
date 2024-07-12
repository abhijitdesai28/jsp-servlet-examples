package in.book;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		String bookId = request.getParameter("bookId");
		String bookName = request.getParameter("bookName");
		String bookPrice = request.getParameter("bookPrice");
		
		System.out.println(bookId);
		System.out.println(bookName);
		System.out.println(bookPrice);
		
		PrintWriter writer = response.getWriter();
		writer.write("Form Submited Succesfully.");
		
        
	}

}
