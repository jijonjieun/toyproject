package com.Thread.index;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ThreadDAO {
	
	@Inject
	@Named ("sqlSession")
	private SqlSession sqlSession;

	public List<ThreadDTO> threadList() {
		
		return sqlSession.selectList("thread.threadList");
	}
	
	
	
	
	
	
}

