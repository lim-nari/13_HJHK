package sanmokunarabe_final;

public class Board {
	public static Cell[][] cell = new Cell[3][3];
	private WinnerLine[] line = new WinnerLine[8];
	
	public Board() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				cell[i][j] = new Cell(i,j);
			}
		}
	}
	
	public boolean checkCoordinate(int x,int y) {
		boolean check = false;
		if(x > 0 && x < 4 && y > 0 && y < 4) {
			check = cell[x-1][y-1].isCellFull();
			if(check == true) {
				return false;
			}else {
				return true;
			}
		}else{
			System.out.println("1から3の数値を入力してください");
			return false;
		}
	}
	
	public boolean judgeWinner() {
		line[0] = new WinnerLine(cell[0][0], cell[0][1], cell[0][2]);
		line[1] = new WinnerLine(cell[1][0], cell[1][1], cell[1][2]);
		line[2] = new WinnerLine(cell[2][0], cell[2][1], cell[2][2]);
		line[3] = new WinnerLine(cell[0][0], cell[1][0], cell[2][0]);
		line[4] = new WinnerLine(cell[0][1], cell[1][1], cell[2][1]);
		line[5] = new WinnerLine(cell[0][2], cell[1][2], cell[2][2]);
		line[6] = new WinnerLine(cell[0][0], cell[1][1], cell[2][2]);
		line[7] = new WinnerLine(cell[0][2], cell[1][1], cell[2][0]);
		
		for(int i=0;i<=7;i++) {
			if(line[i].isWinnerLine() == true) {
				return true;
			}
		}
			return false;
	}
	
	public boolean isFull() {
		if(cell[0][0].getMark()!=Mark.NONE&&cell[0][1].getMark()!=Mark.NONE&&cell[0][2].getMark()!=Mark.NONE &&
			cell[1][0].getMark()!=Mark.NONE&&cell[1][1].getMark()!=Mark.NONE&&cell[1][2].getMark()!=Mark.NONE &&
			cell[2][0].getMark()!=Mark.NONE&&cell[2][1].getMark()!=Mark.NONE&&cell[2][2].getMark()!=Mark.NONE) {
				return true;
		}else{
				return false;
		}
	}

	public void showBoard() {
		System.out.println("――――――――");
		System.out.println("|" + cell[0][0].changeMark() + "|" + 
		cell[0][1].changeMark() + "|" + cell[0][2].changeMark() + "|");
		System.out.println("――――――――");
		System.out.println("|" + cell[1][0].changeMark() + "|" + 
		cell[1][1].changeMark() + "|" + cell[1][2].changeMark() + "|");
		System.out.println("――――――――");
		System.out.println("|" + cell[2][0].changeMark() + "|" + 
		cell[2][1].changeMark() + "|" + cell[2][2].changeMark() + "|");
		System.out.println("――――――――");
	}
}
