package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoticeMapperTest {
	@Autowired
	private NoticeMapper noticeMapper;

	@Test
	void testList() throws Exception {
		List<NoticeDTO> ar = noticeMapper.list();
		assertNotEquals(0, ar.size());
	}

	@Test
	void testCreate() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setBoardTitle("title");
		noticeDTO.setBoardContents("contents");
		noticeDTO.setBoardWriter("P002");
		int result= noticeMapper.create(noticeDTO);
		assertEquals(1, result);
	}

}
