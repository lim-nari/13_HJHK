package sanmokunarabe_final;

public class Cell {
	private int x;
	private int y;
	private Mark mark = Mark.NONE;
	
	public Cell() {
	}
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isCellFull() {
		if (mark == Mark.NONE) {
			return false;
		} else {
			System.out.println("既に置かれています");
			return true;
		}
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public Mark getMark() {
		return mark;
	}
	
	public String changeMark() {
		switch(this.mark) {
		case CIRCLE:
			return "○";
		case CROSS:
			return "×";
		case NONE:
			return " ";
		default:
			return " ";
		}
	}
	
	public int getX() {
		return x+1;
	}
	
	public int getY() {
		return y+1;
	}
}
