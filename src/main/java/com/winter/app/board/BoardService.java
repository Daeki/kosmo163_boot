package com.winter.app.board;

import java.util.List;

import com.winter.app.files.FileDTO;
import com.winter.app.page.Pager;

public interface BoardService {
	
	public int createFile(FileDTO fileDTO)throws Exception;
	
	public Long getCount(Pager pager)throws Exception;
	
	//list
	public List<BoardDTO> list(Pager pager)throws Exception;
	
	//detail
	public BoardDTO detail(BoardDTO boardDTO)throws Exception;
	
	//create
	public int create(BoardDTO boardDTO)throws Exception;
	
	//update
	public int update(BoardDTO boardDTO)throws Exception;
	
	//delete
	public int delete(BoardDTO boardDTO)throws Exception;

}
