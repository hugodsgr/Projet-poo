package goosegame;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<Player> thePlayers;
	private Board board;
	
	public Game(Board board) {
		this.board= board;
		thePlayers = new ArrayList();
	}
	
	public void addPlayer(Player p){
		thePlayers.add(p);
	}
	
	public void play(){
		boolean win = false;
		while(!win)
			for(Player p : thePlayers){
				Cell currentCell = p.getCell();
				System.out.print(p.getName() + " is in cell " + currentCell.getIndex());
				if(!currentCell.canBeLeft()) {
					System.out.print(", " + p.getName() + " cannot play.\n");
					continue;
				}
				
				int dice = p.twoDiceThrow();
				System.out.print(", " + p.getName() + " throws a " + dice);
				int newIndex = getInBoundIndex(p.getCell().getIndex() + dice);
				if(board.getCell(newIndex).handleMove(dice) != newIndex){
					System.out.print(" and reaches cell " + newIndex);
					newIndex = getInBoundIndex(board.getCell(newIndex).handleMove(dice));
				}
				System.out.print(" and reaches cell " + newIndex);
				
				currentCell.welcomePlayer(null);
				
				Cell newCell = board.getCell(newIndex);
				if(newCell.isBusy()) {
					moveBack1(newCell, p);
				}else{
					p.setCell(newCell);
					newCell.welcomePlayer(p);
				}
				System.out.print("\n");
				if(p.getCell().equals(board.getCell(board.getNbCells()-1))){
					//win;
					win = true;
					System.out.println(p.getName() + " has won");
					break;
				}
			}
	}
	
	private void moveBack1(Cell cellDest, Player p){
		System.out.print(" cell is busy, ");
		Player oldPlayer = cellDest.getPlayer();
		Cell prevCell = board.getCell(cellDest.getIndex()-1);
		System.out.println(oldPlayer.getName() + " is sent to cell " + prevCell.getIndex());
		if(prevCell.isBusy()){
			moveBack1(prevCell, oldPlayer);
		}			
		oldPlayer.setCell(prevCell);
		prevCell.welcomePlayer(oldPlayer);
		p.setCell(cellDest);
		cellDest.welcomePlayer(p);
	}
	
	private int getInBoundIndex(int index){
		return index >= board.getNbCells() ? 2* board.getNbCells() - index -2: index;
	}
	
}
