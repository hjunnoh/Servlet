<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method</title>
</head>
<body>

	<%
		//닉네임을 전달 받고, html에 포함
		String nickname = request.getParameter("nickname");
		
		String animal = request.getParameter("animal");
		
		String fruit = request.getParameter("fruit");
		
		String[] foodArray = request.getParameterValues("food");
		
		String foodListString = "";
		for(String food: foodArray) {
			foodListString += food + " ";
		}
	
	%>
	
	<h3><%= nickname %><%= animal %></h3>
	<h3><%= fruit %></h3>
	<h3><%= foodListString %></h3>
</body>
</html>