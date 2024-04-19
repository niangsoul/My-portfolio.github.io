package DBConn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/Dbtest_dataSource")
public class C02DATASOURCE extends HttpServlet{
	//
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url;
	private String id;
	private String pw;
	
	private DataSource dataSource;
	//init
	@Override
	public void init() throws ServletException {
		
		try {
			
		    Context initContext = new InitialContext();
		    Context envContext  = (Context)initContext.lookup("java:/comp/env");
		    dataSource = (DataSource)envContext.lookup("jdbc/MysqlDB");  
		    // (p) 데이터베이스 연결
		    conn = dataSource.getConnection();
		    System.out.println("Connection : "+ conn);
			
		}catch(Exception e) {
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

}
