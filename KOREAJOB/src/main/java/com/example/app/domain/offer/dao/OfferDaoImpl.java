package com.example.app.domain.offer.dao;

import com.example.app.domain.common.dao.UserDaoImpl;
import com.example.app.domain.common.dao.connectionPool.CommonDao;

public class OfferDaoImpl extends CommonDao{

	private static OfferDaoImpl instance ;
	public static OfferDaoImpl getInstance() throws Exception {
		if(instance==null)
			instance=new OfferDaoImpl();
		return instance;
	}
	private OfferDaoImpl() throws Exception{
		System.out.println("OfferDaoImpl's constructor invoke .." + conn);
	}
}
