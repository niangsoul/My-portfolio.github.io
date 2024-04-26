package com.example.app.domain.seeker.dao;

import java.sql.PreparedStatement;

import com.example.app.domain.common.dao.connectionPool.CommonDao;
import com.example.app.domain.common.dto.UserDto;
import com.example.app.domain.seeker.dto.SeekerDto;

public class SeekerDaoImpl extends CommonDao{

	private static SeekerDaoImpl instance ;
	public static SeekerDaoImpl getInstance() throws Exception {
		if(instance==null)
			instance=new SeekerDaoImpl();
		return instance;
	}
	private SeekerDaoImpl() throws Exception{
		System.out.println("SeekerDaoImpl's constructor invoke .." + conn);
	}
	
	//----
	public boolean insert(SeekerDto seekdto ) throws Exception{
		String sql = "INSERT INTO user (Id, Username, Password , Tel , Address) VALUES (?, ?, ?, ?, ? )";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		boolean success = false;
		pstmt.setString(1,seekdto.getId());
		pstmt.setString(2, seekdto.getUsername());
		pstmt.setString(3, seekdto.getPassword());
		pstmt.setString(4, seekdto.getTel());
		pstmt.setString(5, seekdto.getAddress());
		
		int rowsAffected = pstmt.executeUpdate();
		success = rowsAffected > 0;
		return success;
	}
	public boolean delete(SeekerDto seekdto) throws Exception {
		String sql = "delete form user where ID = ? ";
		boolean success = false;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, seekdto.getId());
		int rowsAffected = pstmt.executeUpdate();
		success = rowsAffected > 0;
		return success;
	}

}
