package com.example.app.domain.seeker.service;

import java.util.HashMap;
import java.util.Map;

import com.example.app.domain.common.dao.UserDaoImpl;
import com.example.app.domain.common.dao.connectionPool.CommonDao;
import com.example.app.domain.common.dao.connectionPool.ConnectionPool;
import com.example.app.domain.seeker.dao.SeekerDaoImpl;
import com.example.app.domain.seeker.dto.SeekerDto;
import com.example.app.type.ROLE;
import com.example.app.domain.common.dto.UserDto;

public class SeekerServiceImpl {

	private SeekerDaoImpl seekerDaoImpl;
	private ConnectionPool connectionPool;
	//싱글톤
	private static SeekerServiceImpl instance ;
	public static SeekerServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance=new SeekerServiceImpl();
		return instance;
	}
	
	private SeekerServiceImpl() throws Exception{
		System.out.println("SeekerServiceImpl's constructor invoke ..");	
		seekerDaoImpl = SeekerDaoImpl.getInstance();
		connectionPool = ConnectionPool.getInstance();
	}
	
	
	//회원가입
	public Map<String,Object> join(SeekerDto scckerDto) throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
			
			
			returnValue.put("SeekerDaoImpl", seekerDaoImpl.insert(scckerDto));
	        returnValue.put("success", true);
	        returnValue.put("message", "회원가입이 완료되었습니다.");
		
		
		connectionPool.txCommit();
		return returnValue;
	}
	//회원탈퇴
	public Map<String,Object> remove(SeekerDto scckerDto) throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
			returnValue.remove(seekerDaoImpl.delete(scckerDto));
	        returnValue.put("success", true);
	        returnValue.put("message", "회원탈퇴가 완료되었습니다.");
		//작업위치
		
		connectionPool.txCommit();
		return returnValue;
	}
	
	//회사정보수정
	public Map<String,Object> updateCompanyInfo() throws Exception{
		Map<String,Object> returnValue =new HashMap();
		connectionPool.txStart();
		
		//작업위치
		
		connectionPool.txCommit();
		return returnValue;
	}




	
}
