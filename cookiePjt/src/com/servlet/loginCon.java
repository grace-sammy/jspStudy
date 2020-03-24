package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String mID = request.getParameter("mID");
		String mPW = request.getParameter("mPW");
		
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		
		for(Cookie c:cookies) {
			System.out.println("이름: "+c.getName()+"값: "+c.getValue());
			
			if(c.getName().equals("memberId")) {
				cookie = c;
			}
		}

		
		if(cookie ==null) {
			System.out.println("cookie is null");
			cookie = new Cookie("memebrId", mID);
		}
		
		response.addCookie(cookie);
		//60*60은 한시간
		cookie.setMaxAge(60*60);
		
		response.sendRedirect("loginOK.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
