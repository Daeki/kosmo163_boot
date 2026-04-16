package com.winter.app.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.files.FileDTO;
import com.winter.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Value("${app.upload.base}")
	private String filePath;
	
	@Value("${app.board.notice}")
	private String notice;

	@Override
	public int createFile(FileDTO fileDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> list(Pager pager) throws Exception {
		pager.makePageNumber(noticeMapper.getCount(pager));
		return noticeMapper.list(pager);
	}

	@Override
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		
		return noticeMapper.detail(boardDTO);
	}

	@Override
	public int create(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
