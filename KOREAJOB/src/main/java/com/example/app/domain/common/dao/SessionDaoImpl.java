package com.example.app.domain.common.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.app.domain.common.dao.connectionPool.CommonDao;
import com.example.app.domain.common.dto.SessionDto;

public class SessionDaoImpl extends CommonDao implements DaoFunctionHeaderNaming{

	private static SessionDaoImpl instance ;
	public static SessionDaoImpl getInstance() throws Exception {
		if(instance==null)
			instance=new SessionDaoImpl();
		return instance;
	}
	
	private SessionDaoImpl() throws Exception{
		System.out.println("SessionDaoImpl Constructor "+conn);

	}
	

	@Override
	public boolean select(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selectAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
