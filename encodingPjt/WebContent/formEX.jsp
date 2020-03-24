<!--  둘 다 UTF-8로 변경 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--  jsp에서 servlet으로 -->
	<form action="mSignUp" method="post">
		이름: <input type="text" name="m_Name">
		<br>
		닉네임: <input type="text" name="m_Nick">
		<br>
		<input type="submit" value="sign up">
	</form>
	
	<!--  jsp에서 jsp로 -->
	<form action="mSignUp.jsp" method="post">
		이름: <input type="text" name="m_Name">
		<br>
		닉네임: <input type="text" name="m_Nick">
		<br>
		<input type="submit" value="sign up">
	</form>
</body>
</html>
