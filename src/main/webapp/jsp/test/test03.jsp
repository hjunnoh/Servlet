<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜,시간 링크</title>
</head>
<body>
	<%
	String pagename = request.getParameter("page");
	Date now = new Date();
	String result = null;
	String dateTimeString = null;
	
		if(pagename.equals("time")) {
			SimpleDateFormat formatter = new SimpleDateFormat("HH시 mm분 ss초");
			result = "현재 시간";
			dateTimeString = formatter.format(now);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 dd일");
			result = "오늘 날짜";
			dateTimeString = formatter.format(now);
		}
		
	%>
	<div>
		<h1><%= result %> <%= dateTimeString %></h1>
	</div>
		
		
	
</body>
</html>