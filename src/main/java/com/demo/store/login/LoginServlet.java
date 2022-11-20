package com.demo.store.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("id");
		String pass = request.getParameter("pass");
		if(name.equals("jaseem@gmail.com") && pass.equals("123")) {
			RequestDispatcher re = request.getRequestDispatcher("/Success.html");
			re.forward(request, response);
			
		}else {
			RequestDispatcher re = request.getRequestDispatcher("/Failure.html");
			re.forward(request, response);
			
		}
		out.close();
	}

}
