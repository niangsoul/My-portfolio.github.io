package com.example.app.domain.common.dao;

import com.example.app.domain.common.dao.connectionPool.CommonDao;

public class UserDaoImpl extends CommonDao{

	private static UserDaoImpl instance ;
	public static UserDaoImpl getInstance() throws Exception {
		if(instance==null)
			instance=new UserDaoImpl();
		return instance;
	}
	private UserDaoImpl() throws Exception{
		System.out.println("UserDaoImpl's constructor invoke .." + conn);
	}
	
	
	
	//로그인
	
	//로그아웃
	
}
