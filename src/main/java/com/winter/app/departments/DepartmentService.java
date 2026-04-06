package com.winter.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	//전체 목록 list
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("Service List");
		//참조변수명.메서드명()
		
		List<DepartmentDTO> ar = this.departmentDAO.list();
		
		return ar;
	}

}
