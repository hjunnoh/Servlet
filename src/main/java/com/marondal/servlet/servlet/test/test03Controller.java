package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class test03Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateString = formatter.format(date);
		
		out.println("<html><head><title>단독 속보</title></head><body>");
		out.println("<h1>[단독] 고양이가 야옹해</h1><div>기사 입력시간 : " + dateString + "<div><hr><div>끝</div></body></html>");
	}
}
