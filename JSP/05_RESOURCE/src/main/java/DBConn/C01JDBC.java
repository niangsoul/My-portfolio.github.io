package DBConn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dbtest_jdbc")
public class C01JDBC extends HttpServlet {
	
	//
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url;
	private String id;
	private String pw;
	
	//init
	@Override
	public void init() throws ServletException {
		try {
			// (p) 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// (p) url 로드
			url = "jdbc:mysql://localhost/bookDb";
			// (p) id 로드
			id="root";
			// (p) pw 로드
			pw="1234";
			 // (p) 데이터베이스 연결
			conn =  DriverManager.getConnection(url,id,pw);
			System.out.println("Connection conn : " + conn);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//service
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse resp) throws ServletException, IOException {
		// (p) PrintWriter 생성
		PrintWriter out = resp.getWriter();
		out.println("DB CONNECTION : " + conn);
	}

	

	
	
	
	
	
	//destroy
	//doGet..
}
