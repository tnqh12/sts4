package springbootboard.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootboard.board.entity.Board;
import springbootboard.board.repository.BoardRepository;
import springbootboard.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	
	@Override
	public List<Board> listBoard() {
		return (List<Board>)boardRepository.findAll();
	}

	@Override
	public Board getBoard(Board board, String action) {
		
		Board findBoard = boardRepository.findById(board.getSeq()).get();		
		
		if(action!=null && action.equals("getBoard")) {
			findBoard.setCnt(findBoard.getCnt()+1);
		}
		boardRepository.save(findBoard);		
		return findBoard;
	}

	@Override
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}

	@Override
	public void updateBoard(Board board) {
		Board findBoard = boardRepository.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepository.save(findBoard);
	}

	@Override
	public void deleteBoard(Board board) {
		boardRepository.deleteById(board.getSeq());

	}

}
