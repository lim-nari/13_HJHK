package sanmokunarabe_final;

public class Turn {
	private Player player;
	private Cell cell ;

	public Turn() {
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void requestCoordinate() {
		cell = player.inputTurn();
	}
	
	public void showTurnHistory() {
		Mark mark;
		
		System.out.print(player.getName() + ":(" + cell.getX() + "," + cell.getY() + ")" );
		
		mark = player.getHistoryMark();
		if(mark == Mark.CIRCLE) {
			System.out.println("○");
		}else if(mark == Mark.CROSS) {
			System.out.println("×");
		}
	}
}
