package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce) 
			throws IOException 
	{

			ServletConfig config = getServletConfig();
			String msg = config.getInitParameter("msg2");
			
			PrintWriter writer = responce.getWriter();
			writer.append(msg);
		
	}
}
