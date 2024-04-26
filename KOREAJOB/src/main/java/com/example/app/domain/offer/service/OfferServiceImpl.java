package com.example.app.domain.offer.service;

import java.util.HashMap;
import java.util.Map;

import com.example.app.domain.common.dao.UserDaoImpl;
import com.example.app.domain.common.dao.connectionPool.ConnectionPool;
import com.example.app.domain.offer.dao.OfferDaoImpl;

public class OfferServiceImpl {

	
	private OfferDaoImpl offerDaoImpl;
	private ConnectionPool connectionPool;
	//싱글톤
	private static OfferServiceImpl instance ;
	public static OfferServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance=new OfferServiceImpl();
		return instance;
	}
	
	private OfferServiceImpl() throws Exception{
		System.out.println("OfferServiceImpl's constructor invoke ..");	
		offerDaoImpl = OfferDaoImpl.getInstance();
		connectionPool = ConnectionPool.getInstance();
	}
	
	//회원가입
	public Map<String,Object> join() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		//작업위치
		
		connectionPool.txCommit();
		return returnValue;
	}
	//회원탈퇴
	public Map<String,Object> remove() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		//작업위치
		
		connectionPool.txCommit();
		return returnValue;
	}
	//이력서 등록
	public Map<String,Object> addResume() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		//작업위치
		
		connectionPool.txCommit();
		return returnValue;
	}
	
}
