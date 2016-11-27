package goosegame.cells;

import goosegame.Player;

/**
 * Start cell it has to be the first cell on evry board, extends {@link BasicCell}
 *
 */
public class StartCell extends BasicCell {

	/**
	 * Constructor
     */
	public StartCell() {
		super(0);
	}
	/**
	 * always return false
	 * @return false
	 */
	@Override
	public boolean isBusy() {
		return false;
	}

	/**
	 * Does nothing
	 * @param player tbe player arriving on this cell
     */
	@Override
	public void welcomePlayer(Player player) {}
	
	@Override
	public String toString() {
		return "Start cell";
	}

}
