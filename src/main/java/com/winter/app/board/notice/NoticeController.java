package com.winter.app.board.notice;

import com.winter.app.Kosmo163BootApplication;
import com.winter.app.page.Pager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

    
	@GetMapping("detail")
	public String detail(NoticeDTO noticeDTO, Model model)throws Exception{
		noticeDTO = noticeService.detail(noticeDTO);
		model.addAttribute("dto", noticeDTO);
		return "board/detail";
	}
	
	
	@GetMapping("list")
	public String list(Pager pager, Model model)throws Exception{
		List<NoticeDTO> ar = noticeService.list(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("list", ar);
		return "board/list";
	}
	
	@GetMapping("create")
	public String create()throws Exception{
		return "board/create";
	}
	
	@PostMapping("create")
	public String create(NoticeDTO noticeDTO,@RequestParam("attach") MultipartFile [] attach)throws Exception{
		
		
		int result = noticeService.create(noticeDTO, attach);
		return "redirect:./list";
	}
	
	

}
