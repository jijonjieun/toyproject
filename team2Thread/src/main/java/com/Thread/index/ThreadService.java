package com.Thread.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ThreadService {

	@Autowired
	private ThreadDAO threadDAO;
	
	public List<ThreadDTO> threadList() {
		return threadDAO.threadList();
	}

}
