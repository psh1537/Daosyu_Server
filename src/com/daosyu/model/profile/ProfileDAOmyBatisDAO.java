package com.daosyu.model.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProfileDAOmyBatisDAO implements ProfileDAO{
	@Autowired
	private ProfileDAO prfileDAO;
	

	@Override
	public void insert(Profile profile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profile selectOne(int profile_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Profile profile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int profile_id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
