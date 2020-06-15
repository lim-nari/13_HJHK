package sanmokunarabe_final;

import java.util.ArrayList;
import java.util.List;

public class Sanmokunarabe {
	private Board board;
	private Player player;
	private Player firstPlayer;
	private Player secondPlayer;
	private List<Turn> turns = new ArrayList<Turn>();
	
	public Sanmokunarabe() {
		board = new Board();
		firstPlayer = new Player("先攻",Mark.CIRCLE);
		secondPlayer = new Player("後攻",Mark.CROSS);
	}
	
	public void startGame(){
		board.showBoard();
		player = firstPlayer;
		
		boolean isWin = false;
		boolean isFull = false;
		
		while(isWin == false && isFull == false) {
			Turn turn = new Turn();
			turn.setPlayer(player);
			turn.requestCoordinate();
			turns.add(turn);
			board.showBoard();
				
			if(board.judgeWinner() == true) {
				isWin = true;
				break;
			}
			
			if(board.isFull() == true) {
				isFull = true;
				break;
			}
			
			player = changePlayer(player);
			}
			
			if(isWin == true) {
				showWinner();
				for(Turn turnNum : turns) {
					turnNum.showTurnHistory();
				}
			}
			
			if(isFull == true) {
				showDraw();
				for(Turn turnNum: turns) {
				turnNum.showTurnHistory();
				}
			}
		}
	
	public void showWinner() {
		System.out.println("勝者：" + player.getName());
		System.out.println();
		System.out.println("＜ターン履歴＞");	
	}
	
	public void showDraw() {
		System.out.println("引き分け");
		System.out.println();
		System.out.println("＜ターン履歴＞");	
	}
	
	private Player changePlayer(Player player) {
		if(player == firstPlayer) {
			return secondPlayer;
		}else if(player == secondPlayer) {
			return firstPlayer;
		}
		return null;
	}
	
}
