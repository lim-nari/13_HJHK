package sanmokunarabe_final;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class WinnerLine_Test {
	
	@Test
	public void 横ライン() {
		Cell cell0 = new Cell(1,1);
		Cell cell1 = new Cell(1,2);
		Cell cell2 = new Cell(1,3);
		cell0.setMark(Mark.CIRCLE);
		cell1.setMark(Mark.CIRCLE);
		cell2.setMark(Mark.CIRCLE);
		
		WinnerLine line = new WinnerLine(cell0,cell1,cell2);
		
		boolean result = line.isWinnerLine();
		assertThat(result, is (true));
	}
	
	@Test
	public void 斜めライン() {
		Cell cell0 = new Cell(1,1);
		Cell cell1 = new Cell(2,2);
		Cell cell2 = new Cell(3,3);
		cell0.setMark(Mark.CROSS);
		cell1.setMark(Mark.CROSS);
		cell2.setMark(Mark.CROSS);
		
		WinnerLine line = new WinnerLine(cell0,cell1,cell2);
		
		boolean result = line.isWinnerLine();
		assertThat(result, is (true));
	}
	
	@Test
	public void 縦ライン() {
		Cell cell0 = new Cell(1,1);
		Cell cell1 = new Cell(2,1);
		Cell cell2 = new Cell(3,1);
		cell0.setMark(Mark.CIRCLE);
		cell1.setMark(Mark.CIRCLE);
		cell2.setMark(Mark.CIRCLE);
		
		WinnerLine line = new WinnerLine(cell0,cell1,cell2);
		
		boolean result = line.isWinnerLine();
		assertThat(result, is (true));
	}
	
	@Test
	public void 違うマークライン() {
		Cell cell0 = new Cell(1,1);
		Cell cell1 = new Cell(1,2);
		Cell cell2 = new Cell(1,3);
		cell0.setMark(Mark.CIRCLE);
		cell1.setMark(Mark.CROSS);
		cell2.setMark(Mark.CIRCLE);
		
		WinnerLine line = new WinnerLine(cell0,cell1,cell2);
		
		boolean result = line.isWinnerLine();
		assertThat(result, is (false));
	}
}
