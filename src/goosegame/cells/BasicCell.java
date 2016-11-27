package goosegame.cells;

import goosegame.Cell;
import goosegame.Player;
/**
 * the basic implementation of {@link Cell} it does nothing in particular just implements the methods
 * @see Cell
 */
public class BasicCell implements Cell{
	
	protected int index;
	private Player player;
	
	
	/**
	 * Constructor
	 * @param index index of the Cell in the board
	 */
	public BasicCell(int index){
		this.index = index;
	}

	@Override
	public boolean canBeLeft() {
		return true;
	}

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public int handleMove(int diceThrow) {
		return index;
	}

	@Override
	public boolean isBusy() {
		return player != null;
	}

	@Override
	public void welcomePlayer(Player player) {
		this.player = player;
	}

	@Override
	public Player getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		return "Basic cell";
	}

}
