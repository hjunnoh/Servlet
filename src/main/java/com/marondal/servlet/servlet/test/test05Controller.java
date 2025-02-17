package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class test05Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String num = request.getParameter("number");
		
		int number = Integer.parseInt(num);
		
		out.println("<html><head><title>구구단</title></head><body>");
		out.println("<ul>");
		
		for(int i = 1; i <= 9; i++) {
			int result = number * i;
			out.println("<li>" + number + " X " + i + " = " + result + "</li>");
		}
		
		out.println("</ul></body></html>");
		
	}
}
