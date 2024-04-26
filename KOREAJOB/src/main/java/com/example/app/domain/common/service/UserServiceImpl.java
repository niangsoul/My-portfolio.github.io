package com.example.app.domain.common.service;

import java.util.HashMap;
import java.util.Map;

import com.example.app.domain.common.dao.UserDaoImpl;
import com.example.app.domain.common.dao.connectionPool.ConnectionPool;

public class UserServiceImpl {
	
	private UserDaoImpl userDaoImpl;
	private ConnectionPool connectionPool;
	//싱글톤
	private static UserServiceImpl instance ;
	public static UserServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance=new UserServiceImpl();
		return instance;
	}
	
	private UserServiceImpl() throws Exception{
		System.out.println("UserServiceImpl's constructor invoke ..");	
		userDaoImpl = UserDaoImpl.getInstance();
		connectionPool = ConnectionPool.getInstance();
	}
	
	
	
	//login
	public Map<String,Object> login() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		
		
		
		
		connectionPool.txCommit();
		return returnValue;
	}
	
	//logout
	public Map<String,Object> logout() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		
		
		
		
		connectionPool.txCommit();
		return returnValue;
	}
	
	
	
}
