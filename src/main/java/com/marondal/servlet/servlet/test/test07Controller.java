package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class test07Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.parseInt(request.getParameter("price"));
		
		
		
		out.println("<html><head><title>주문</title></head><body>");
		
		if(!address.contains("서울시")) {
			out.println("<div>배달 불가 지역입니다.</div>");		
		}
		
		else if(card.equals("신한카드")) {
			out.println("<div>결제 불가 카드입니다.");
		}
		
		else {
			out.println("<h3>" + address + "로 배달 준비중</h3>");
			out.println("<hr><div>결제금액 : " + price + "원</div>");
		}
		
		out.println("</body></html>");
	}

}
