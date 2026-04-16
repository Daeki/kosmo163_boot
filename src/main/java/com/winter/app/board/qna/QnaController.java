package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardDTO;
import com.winter.app.page.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
	public String list(Pager pager, Model model)throws Exception{
		List<BoardDTO> ar = qnaService.list(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("list", ar);
		return "board/list";
	}
	
	/*
	 * //답글
	 * 
	 * @GetMapping("reply") public void replyCreate(QnaDTO qnaDTO, Model
	 * model)throws Exception{ model.addAttribute("qnaDTO", qnaDTO); }
	 * 
	 * @PostMapping("reply") public String replyCreate(QnaDTO qnaDTO)throws
	 * Exception{ int result = qnaService.replyCreate(qnaDTO); return
	 * "redirect:./list"; }
	 */
}
