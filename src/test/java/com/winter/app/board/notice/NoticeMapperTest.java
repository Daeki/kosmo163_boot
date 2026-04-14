package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeMapperTest {
	@Autowired
	private NoticeMapper noticeMapper;


	@Test
	void detailTest()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setBoardNum(130L);
		
		noticeDTO = noticeMapper.detail(noticeDTO);
		log.info("Map : {}", noticeDTO);
		assertNotNull(noticeDTO);
		
	}


}
