package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
	 
	   private String message;

	   public void init() throws ServletException {
	      // Do required initialization
	      message = "Hello World";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	   }

	   public void destroy() {
	      // do nothing.
	   }
	}
