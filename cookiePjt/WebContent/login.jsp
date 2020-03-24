<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
Cookie[] cookies = request.getCookies();

if(cookies !=null){
	for(Cookie c : cookies){
		if(c.getName().equals("memberID")){
			response.sendRedirect("loginOK.jsp");
		}
	}
}
%>

<form action="loginCon" method="post">
ID:<input type="text" name="mID"><br>
password: <input type="password" name="mPW"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>