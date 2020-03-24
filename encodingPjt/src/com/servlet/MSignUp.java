package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mSignUp")
public class MSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//post방식이므로
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//GET방식일 경우 Server프로젝트에서 server.xml에서 <connector connectionTimeOut=~~~......> 이곳에 URIEncoding="UTF-8" 추가
		//<connector URIEncoding="UTF-8" connectionTimeOut=~~~......>
		
		
		PrintWriter out = response.getWriter();
		String m_Name = request.getParameter("m_Name");
		String m_Nick = request.getParameter("m_Nick");
		out.println("<p>"+m_Name+"</p>");
		out.println("<p>"+m_Nick+"</p>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
