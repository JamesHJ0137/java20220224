package chap15.book.Exercise.p07;

import java.util.List;

import chap15.book.Exercise.s150202.*;

import java.util.ArrayList;

public class BoardDao {

	public List<Board> geBoardList() {
		List<Board> list = new ArrayList<>();
		
		Board b1 = new Board("제목1", "내용1");
		list.add(b1);
		Board b2 = new Board("제목2", "내용2");
		list.add(b2);
		Board b3 = new Board("제목3", "내용3");
		list.add(b3);
		return list;
	}
	
}
