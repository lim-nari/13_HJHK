package sanmokunarabe_final;

public class WinnerLine {

	private Cell[] cell = new Cell[3];

	public WinnerLine() {
	}

	public WinnerLine(Cell cell0, Cell cell1, Cell cell2) {
		cell[0] = cell0;
		cell[1] = cell1;
		cell[2] = cell2;
	}

	public boolean isWinnerLine() {
		if (cell[0].getMark().equals(Mark.CIRCLE) && 
			cell[1].getMark().equals(Mark.CIRCLE) &&
			cell[2].getMark().equals(Mark.CIRCLE) ||
			cell[0].getMark().equals(Mark.CROSS) && 
			cell[1].getMark().equals(Mark.CROSS) &&
			cell[2].getMark().equals(Mark.CROSS)) { 
			return true;
		} else {
			return false;
		}
	}
}
