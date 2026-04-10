package com.winter.app.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.page.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	public List<NoticeDTO> list(Pager pager)throws Exception{
		
		pager.makePageNumber(noticeMapper.getCount());
		
		
		
		return noticeMapper.list(pager);
	}
	
	
	
	
	public int create(NoticeDTO noticeDTO)throws Exception{
		return noticeMapper.create(noticeDTO);
	}

}
