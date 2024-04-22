package com.example.app.domain.dao.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPool_ByHikari {


	protected String url ="jdbc:mysql://localhost:3306/bookdb";
	protected String id = "root";
	protected String pw = "1234";

	//05-03 application.properties
	protected Connection conn =null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	
	//05-02 Hikari
	private DataSource dataSource;
	
	private static ConnectionPool_ByHikari instance ;
	public static ConnectionPool_ByHikari getInstance() throws Exception {
		if(instance==null)
			instance=new ConnectionPool_ByHikari();
		return instance;
	}
	

	private ConnectionPool_ByHikari() throws Exception{
		
		try {
			
		    Context initContext = new InitialContext();
		    Context envContext  = (Context)initContext.lookup("java:/comp/env");
		    dataSource = (DataSource)envContext.lookup("jdbc/HikariDataSource");  
		    conn = dataSource.getConnection();
		    System.out.println("Connection : "+ conn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return conn;
	}
	
	
	
	//05-01 TX
	public void txStart() throws SQLException {
		conn.setAutoCommit(false);	
	}
	//05-01 TX
	public void txCommit() throws SQLException {
		conn.commit();
	}
	//05-01 TX
	public void txRollBack() throws SQLException {
		conn.rollback();
	}
	
	
}