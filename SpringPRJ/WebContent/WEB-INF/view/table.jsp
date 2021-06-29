<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>


<% for(int i=0;i<3;i++) { %><tr>  <!-- tr이 밖에서 돌아야함 해당 행이 끝나고 그다음 줄로 바꾸기위해서  밖에서닫아줘야함-->
	<% for(int j=0;j<4;j++) { %>
		<td><%=i %>행<%=j %>열</td>
	<% } %> 
		</tr>
<% } %> 


</table>

</body>
</html>