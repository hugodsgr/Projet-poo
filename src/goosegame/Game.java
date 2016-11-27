package goosegame;

import java.util.ArrayList;
import java.util.List;
/**
 * Game class
 *
 */
public class Game {

	private List<Player> thePlayers;
	private Board board;
	/**
	 * Constructor
	 * @param board the board use for the game
	 */
	public Game(Board board) {
		this.board= board;
		thePlayers = new ArrayList<Player>();
	}
	/**
	 * add a player to the game
	 * @param p the player to be added
	 */
	public void addPlayer(Player p){
		thePlayers.add(p);
	}
	
	/**
	 * Main method, plays the game until there is a winner 
	 */
	public void play(){
		boolean win = false;
		while(!win){
			for(Player p : thePlayers){
				Cell currentCell = p.getCell();
				System.out.print(p.getName() + " is in cell " + currentCell.getIndex() + " : ");
				if(!currentCell.canBeLeft()) {
					System.out.print(p.getName() + " cannot play.\n");
					continue;
				}				
				int dice = p.twoDiceThrow();
				System.out.print(p.getName() + " throws a " + dice);
				int newIndex = getInBoundIndex(p.getCell().getIndex() + dice);
				if(board.getCell(newIndex).handleMove(dice) != newIndex){
					System.out.print(" => "+p.getName() + " reaches cell " + newIndex + " (" + board.getCell(newIndex) + ")");
					newIndex = getInBoundIndex(board.getCell(newIndex).handleMove(dice));
				}
				System.out.print(" => "+p.getName() + " reaches cell " + newIndex +  " (" + board.getCell(newIndex) + ").");
				
				currentCell.welcomePlayer(null);
				
				Cell newCell = board.getCell(newIndex);
				if(newCell.isBusy()) {
					System.out.print(" Cell is busy : ");
					Player oldPlayer = newCell.getPlayer();
					System.out.print(oldPlayer.getName() + " is sent to cell " + currentCell.getIndex() + " (" + currentCell + ").");	
					oldPlayer.setCell(currentCell);
					currentCell.welcomePlayer(oldPlayer);
				}
				p.setCell(newCell);
				newCell.welcomePlayer(p);
				System.out.print("\n");
				if(p.getCell().equals(board.getCell(board.getNbCells()-1))){
					//win;
					win = true;
					System.out.println(p.getName() + " has won");
					break;
				}
			}
		}
	}
	
	/**
	 * given a index it return the index which is in th board
	 * @param index not in the board
	 * @return index int the board
	 */
	private int getInBoundIndex(int index){
		return index >= board.getNbCells() ? 2* board.getNbCells() - index -2: index;
	}
	
}
