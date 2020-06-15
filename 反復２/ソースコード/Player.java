package sanmokunarabe_final;

import java.util.Scanner;
 
public class Player {
	private String name;
	private Mark mark = Mark.NONE;
	private Board board = new Board();

	public Player(String name, Mark mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public Mark getHistoryMark() {
		return mark;
	}
	
	public Cell inputTurn() {
		int x = 0;
		int y = 0;
		Scanner scanner;
		
		boolean request = false;
		
		while(request == false) {
			System.out.println("行と列を半角スペースで区切って入力してください" + "(例：二列目の三行目→2 3)");
			scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] num = input.split(" ");
			x = Integer.parseInt(num[0]);
			y = Integer.parseInt(num[1]);
			request = board.checkCoordinate(x,y);
		}
	
		Board.cell[x-1][y-1].setMark(this.mark);
		return Board.cell[x-1][y-1];
	}
}