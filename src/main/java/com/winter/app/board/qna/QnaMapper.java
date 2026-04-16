package com.winter.app.board.qna;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.winter.app.board.BoardMapper;
import com.winter.app.page.Pager;

@Mapper
public interface QnaMapper extends BoardMapper {

	
	public int replyUpdate(QnaDTO qnaDTO)throws Exception;

}
