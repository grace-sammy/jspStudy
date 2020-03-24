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
	
		//�ѱ�ó���ϱ� ���ؼ�, jsp�� �����°� �ƴϴϱ� �̰͸� �ᵵ ��
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/*���1
		//����̹�, ��  OracleDriver Ŭ������ �޸𸮿� �ε� �ؾ��ϱ� ������ drive�� ������ش�.
		String driver = "oracle.jdbc.driver.OracleDriver";
		//localhost�� �ִ� 1521 port ��ȣ
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String id = "scott";
		String pw = "tiger";
		
		// connection ��ü
		Connection con = null;
		
		// statement ��ü
		Statement stmt = null;
		
		// �˻����
		ResultSet res = null;
		
		try {
			// ����̹� �ε�
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
		//�ڿ��� �ٽ� �ݾ�����Ѵ�.
			try {
				if(res != null) res.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
		
		
		//���2: DAO�� ���ȭ�Ͽ� �и���Ŵ
		BookDAO bookDAO = new BookDAO();
		//select �޼ҵ� ȣ��
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
