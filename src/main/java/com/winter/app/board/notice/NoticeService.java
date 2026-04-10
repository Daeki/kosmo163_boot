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
		Map<String, Long> map = new HashMap<>();
		
		this.make(pager);
		
		
		Long b = (pager.getPage()-1)*10+1;
		Long e = pager.getPage()*10;
		map.put("begin", b);
		map.put("end", e);
	
		
	
		
		return noticeMapper.list(map);
	}
	
	private void make(Pager pager) throws Exception {
		//1. 총 글의 갯수
		Long totalCount = noticeMapper.getCount();
		
		//2. 총 페이지수 
		Long totalPage = totalCount/10;
		if(totalCount%10 != 0) {
			totalPage++;
		}
		
		//3. 총 블럭 갯수
		Long perBlock=5L;
		Long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		
		//4. 현재 페이지 번호로 현재 블럭 번호 구하기
		Long curBlock = pager.getPage()/perBlock;
		if(pager.getPage()%perBlock != 0) {
			curBlock++;
		}
		
		//5. 현재 블럭 번호로 시작번호와 끝번호 구하기
		Long start = (curBlock-1)*perBlock+1;
		Long end = curBlock*perBlock;
		
		pager.setStart(start);
		pager.setEnd(end);
		
		
	}
	
	
	public int create(NoticeDTO noticeDTO)throws Exception{
		return noticeMapper.create(noticeDTO);
	}

}
