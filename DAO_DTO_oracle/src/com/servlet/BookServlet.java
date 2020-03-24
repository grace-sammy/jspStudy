package com.servlet;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bs")
public class BookServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//한글처리하기 위해서, jsp로 보내는게 아니니까 이것만 써도 됨
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/*방법1
		//드라이버, 이  OracleDriver 클래스를 메모리에 로딩 해야하기 때문에 drive를 만들어준다.
		String driver = "oracle.jdbc.driver.OracleDriver";
		//localhost에 있는 1521 port 번호
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String id = "scott";
		String pw = "tiger";
		
		// connection 객체
		Connection con = null;
		
		// statement 객체
		Statement stmt = null;
		
		// 검색결과
		ResultSet res = null;
		
		try {
			// 드라이버 로딩
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, id, pw);
			
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM book";
			
			res = stmt.executeQuery(sql);
			
			
			while (res.next()) {
				int bookId = res.getInt("book_id");
				String bookName = res.getString("book_name");
				String bookLoc = res.getString("book_loc");
				
				out.print("bookId : " + bookId + ", ");
				out.print("bookName : " + bookName + ", ");
				out.print("bookLoc : " + bookLoc + "</br>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		//자원을 다시 닫아줘야한다.
			try {
				if(res != null) res.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
		
		
		//방법2: DAO로 모듈화하여 분리시킴
		BookDAO bookDAO = new BookDAO();
		//select 메소드 호출
		ArrayList<BookDTO> list = bookDAO.select();
		
		for (int i = 0; i < list.size(); i++) {
			BookDTO dto = list.get(i);
			int bookId = dto.getBookId();
			String bookName = dto.getBookName();
			String bookLoc = dto.getBookLoc();
			
			out.println("bookId : " + bookId + ", ");
			out.println("bookName : " + bookName + ", ");
			out.println("bookLoc : " + bookLoc + "</br>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
