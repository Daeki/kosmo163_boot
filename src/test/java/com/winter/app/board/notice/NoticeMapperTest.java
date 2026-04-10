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
	void getCountTest()throws Exception{
		Long result = noticeMapper.getCount();
		assertNotEquals(0, result);
	}


}
