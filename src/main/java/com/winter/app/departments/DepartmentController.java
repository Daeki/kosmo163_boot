package com.winter.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("list")
	public String list(Model model) {
		List<DepartmentDTO> ar = departmentService.list();
		
		//request와 비슷한 역할, Spring이 제공
		
		model.addAttribute("list", ar);
		
		return "departments/list";
	}
	
	@GetMapping("detail")
	public String detail(@RequestParam(name="num") String num) {
		DepartmentDTO departmentDTO = departmentService.detail(num);
		
		return "departments/detail";
	}
	
	@GetMapping("create")
	public void create() {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentNo("070");
		departmentDTO.setDepartmentName("사학과");
		departmentDTO.setCategory("인문사회");
		departmentDTO.setOpenYn("N");
		departmentDTO.setCapacity(20L);
		int result = departmentService.create(departmentDTO);
		System.out.println("희망 값 : 1 , 실제값 :"+ result);
	}
	
	@GetMapping("delete")
	public void delete(DepartmentDTO departmentDTO) {
		
		int result = departmentService.delete(departmentDTO);
		System.out.println("희망 값 : 1 , 실제값 :"+ result);
		
	}
	
	@GetMapping("update")
	public void update() {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentNo("070");
		departmentDTO.setDepartmentName("고고학");
		departmentDTO.setCategory("예체능");
		departmentDTO.setOpenYn("Y");
		departmentDTO.setCapacity(40L);
		int result = departmentService.update(departmentDTO);
		
		System.out.println("희망 값 : 1 , 실제값 :"+ result);
		
	}

}
