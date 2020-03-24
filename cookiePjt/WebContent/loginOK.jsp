<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies){
	out.println("name:"+c.getName());
	out.println("value:"+c.getValue());
	out.println("===========================");
}
%>

</body>
</html>