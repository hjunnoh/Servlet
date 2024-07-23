package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class test10Controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<html><head><title>로그인</title></head><body>");
		if (!userMap.get("id").equals(id)) {
			out.println("id가 일치하지 않습니다.");
		}
		
		else if (!userMap.get("password").equals(password)) {
			out.println("password가 일치하지 않습니다.");
		}
		
		else {
			out.println("<h3>" + userMap.get("name") + "님 환영 합니다.</h3>");
		}
		
		out.println("</body></html>");
		
		
	}
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hjnoh19");
	        put("password", "shghkswns2");
	        put("name", "노환준");
	    }
	};
}
