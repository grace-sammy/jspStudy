<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="mSignUp" method="get">
		name : <input type="text" name="m_name"> </br>
		password : <input type="password" name="m_pass"></br>
		gender : Man<input type="radio" name="m_gender" value="M" checked="checked">, Woman<input type="radio" name="m_gender" value="W"></br>
		hobby : Sport<input type="checkbox" name="m_hobby" value="sport">, 
				Cooking<input type="checkbox" name="m_hobby" value="cooking">, 
				Reading<input type="checkbox" name="m_hobby" value="reading">,
				Travel<input type="checkbox" name="m_hobby" value="travel"></br>
		residence : <select name="m_residence">
						<option value="seoul" selected="selected">Seoul</option>
						<option value="gyeonggi">Gyeonggi</option>
						<option value="chungcheong">Chungcheong</option>
						<option value="jeonra">Jeonra</option>
						<option value="jeju">Jeju</option>
						<option value="gyeongsang">Gyeongsang</option>
						<option value="gangwon">Gangwon</option>
					</select></br>
					<input type="submit" value="sign up">
	</form>

</body>
</html>