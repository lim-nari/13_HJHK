package sanmokunarabe_final;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerBoardCell_Test {
	Player player;
	Board board;

	@Test
	public void insideRangeTest_1_1() {
		player = new Player("先攻",Mark.CIRCLE);
		board = new Board();
		player.inputTurn();//(1,1)を入力する。
		Cell result = player.inputTurn();
		Cell expected = Board.cell[0][0];
		assertThat(result, is (expected));
	}
	
	@Test
	public void insideRangeTest_3_3() {
		player = new Player("先攻",Mark.CIRCLE);
		board = new Board();
		player.inputTurn();//(1,1)を入力する。
		Cell result = player.inputTurn();
		Cell expected = Board.cell[2][2];
		assertThat(result, is (expected));
	}
}