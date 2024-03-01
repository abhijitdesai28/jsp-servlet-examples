package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PostEx
 */
@WebServlet("/PostEx")
public class PostEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     * 
     */
	
	 public void GetEx() {
	      //  super();
	        // TODO Auto-generated constructor stub
	    }
	 
	 
    public PostEx() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String password =request.getParameter("password");
		
		out.write(last_name+" "+last_name);
	}

}
