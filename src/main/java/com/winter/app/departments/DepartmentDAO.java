package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	

	//전체 목록 list
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("DAO List");
		return session.selectList("com.winter.app.departments.DepartmentDAO.list");//namespace.id명
		
		//1. DB 연결
		
		
		//2. SQL문 생성
		
		
		//3. 미리 전송
		
		
		//4. ? 세팅
		
		//5. 최종 전송 및 결과 처리
		
		
		
		
		//6. 연결 해제
				
	}
	
}
