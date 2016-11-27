package goosegame.cells;

import goosegame.Player;

/**
 * implementation of the trap cell, extends {@link BasicCell}
 */
public class TrapCell extends BasicCell {

	/**
	 * Constructor
	 * @param i the index of the cell
     */
	public TrapCell(int i) {
		super(i);
	}

	/**
	 * Always return false
	 * @return false
     */
	@Override
	public boolean canBeLeft() {
		return false;
	}
	
	@Override
	public void welcomePlayer(Player player) {
		super.welcomePlayer(player);
	}
	
	@Override
	public String toString() {
		return "Trap cell";
	}
	
}
