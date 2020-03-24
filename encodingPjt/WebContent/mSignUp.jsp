<!-- servlet에서 해줬듯이 jsp에서도 setcharacter 사용하여 UTF-8로 변경 -->
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 세 곳 모두 UTF-8로 변경 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>

<%
String mName;
String mNickname;
%>

<%
mName = request.getParameter("m_Name");
mNickname = request.getParameter("m_Nick");
%>


이름: <%=mName %>;
닉네임: <%=mNickname %>;

</body>
</html>