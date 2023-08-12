package com.Thread.myinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Thread.login.LoginDTO;

@Service
public class MyInfoService {	

	@Autowired
private MyInfoDAO myInfoDAO;
	
	
	public LoginDTO myInfo(String id) {
		return myInfoDAO.myInfo(id);
	}




}
