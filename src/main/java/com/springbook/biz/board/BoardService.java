package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//CRUD 메소드 기능 구현
	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	List<BoardVO> getBoardList(BoardVO vo);

}