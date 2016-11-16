package goosegame;

import java.util.List;

public class Game {

	private List<Player> thePlayers;
	private Board board;
	
	public Game(Board board) {
		this.board= board;
	}
	
	public void addPlayer(Player p){
		thePlayers.add(p);
	}
	
	public void play(){
		boolean win = false;
		Player winner;
		while(!win)
			for(Player p : thePlayers){
				Cell currentCell = p.getCell();
				if(!currentCell.canBeLeft()) continue;
				
				int dice = p.twoDiceThrow();
				int newIndex = p.getCell().handleMove(dice);
				if(newIndex > board.getNbCells()){
					newIndex = 2* board.getNbCells() - newIndex;
				}
				Cell newCell = board.getCell(newIndex);
				if(newCell.isBusy()) {
					moveBack1(newCell, p);
				}else{
					p.setCell(newCell);
					newCell.welcomePlayer(p);
				}
				if(p.getCell().equals(board.getCell(board.getNbCells()))){
					//win;
					win = true;
					winner = p;
					break;
				}
			}
	}
	
	private void moveBack1(Cell cellDest, Player p){
		Player oldPlayer = cellDest.getPlayer();
		Cell prevCell = board.getCell(cellDest.getIndex()-1);
		if(prevCell.isBusy()){
			moveBack1(prevCell, oldPlayer);
		}			
		oldPlayer.setCell(prevCell);
		prevCell.welcomePlayer(oldPlayer);
		p.setCell(cellDest);
		cellDest.welcomePlayer(p);
	}
	
}
