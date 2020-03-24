<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 세션의 유무 확인 -->
<%

if(session.getAttribute("memeberID") != null){
	response.sendRedirect("loginOK.jsp");
}


%>


<form action="logincon" method="post">
ID: <input type="text" name="mID">
PW: <input type="password" name="mPW">
<input type="submit" value="login">

</form>
</body>
</html>