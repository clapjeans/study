<%@page import="static poly.util.CmmUtil.nvl"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String name= nvl((String)request.getAttribute("name"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/doPost.do" method="post">

이름 : <input type="text" name="name" placeholder="이름"><br>
<input type="submit">

</form>

</body>
</html>