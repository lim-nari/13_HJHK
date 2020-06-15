package sanmokunarabe_final;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class BoardCell_Test {
	Board board;
	
	@Test
	public void 引き分けの場合() {
		Board board = new Board();
		Board.cell[1][1].setMark(Mark.CIRCLE);
		Board.cell[0][0].setMark(Mark.CROSS);
		Board.cell[0][2].setMark(Mark.CIRCLE);
		Board.cell[2][0].setMark(Mark.CROSS);
		Board.cell[1][0].setMark(Mark.CIRCLE);
		Board.cell[1][2].setMark(Mark.CROSS);
		Board.cell[0][1].setMark(Mark.CIRCLE);
		Board.cell[2][1].setMark(Mark.CROSS);
		Board.cell[2][2].setMark(Mark.CIRCLE);

		boolean result = board.isFull();
		assertThat(result, is (true));
		}
	
	@Test
	public void 勝負ありの場合() {
		Board board = new Board();
		Board.cell[1][1].setMark(Mark.CIRCLE);
		Board.cell[1][0].setMark(Mark.CROSS);
		Board.cell[0][0].setMark(Mark.CIRCLE);
		Board.cell[2][0].setMark(Mark.CROSS);
		Board.cell[2][2].setMark(Mark.CIRCLE);

		boolean result = board.isFull();
		assertThat(result, is (false));
		}	

	@Test
	public void outsideRangeTest_0_0() {
		board = new Board();
		boolean result = board.checkCoordinate(0, 0);
		boolean expected = false;
		assertThat(result, is (expected));
	}

	@Test
	public void outsideRangeTest_4_4() {
		board = new Board();
		boolean result = board.checkCoordinate(4, 4);
		boolean expected = false;
	assertThat(result, is (expected));
	}
	
	@Test
	public void fullRangeTest() {
		board = new Board();
		Board.cell[0][0].setMark(Mark.CIRCLE);
		boolean result = board.checkCoordinate(1, 1);
		boolean expected = false;
		assertThat(result, is (expected));
	}
}
