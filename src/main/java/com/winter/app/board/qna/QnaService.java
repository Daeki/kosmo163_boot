package com.winter.app.board.qna;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.board.notice.NoticeService;
import com.winter.app.files.FileDTO;
import com.winter.app.page.Pager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService implements BoardService {

    
	
	@Autowired
	private QnaMapper qnaMapper;
	
	


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
		pager.makePageNumber(qnaMapper.getCount(pager));
		
		return qnaMapper.list(pager);
	}




	@Override
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
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




	/*
	 * //답글 public int replyCreate(QnaDTO qnaDTO)throws Exception{ QnaDTO parent =
	 * qnaMapper.detail(qnaDTO);
	 * 
	 * //답글의 REF qnaDTO.setBoardRef(parent.getBoardRef()); //답글의 STEP
	 * qnaDTO.setBoardStep(parent.getBoardStep()+1);
	 * 
	 * //답글의 DEPTH qnaDTO.setBoardDepth(parent.getBoardDepth()+1);
	 * 
	 * int result = qnaMapper.replyUpdate(parent);
	 * 
	 * result = qnaMapper.create(qnaDTO);
	 * 
	 * return result;
	 * 
	 * }
	 */

}
