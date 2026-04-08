package com.winter.app.departments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO implements DepartmentMapper {
	
	@Autowired
	private SqlSession session;
	
	private final String NAMESPACE="com.winter.app.departments.DepartmentDAO.";
	//어느 namespace의 어떤 id를 가진 쿼리 태그를 실행 할 것인가

	@Override
	public List<DepartmentDTO> list() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(NAMESPACE+"list");
	}

	@Override
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(NAMESPACE+"detail", departmentDTO);
	}

	@Override
	public int create(DepartmentDTO departmentDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DepartmentDTO departmentDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(DepartmentDTO departmentDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
