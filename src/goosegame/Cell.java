package goosegame;

/**
 * Interface for the cells of the "jeu de l'oie" game. Note that there can be only
 * one player by cell, the starting cell (index 0) excepted.
 */
public interface Cell {
	/**
	 * @return <tt>true</tt> if and only if the player in this cell can freely
	 *  leaves the cell, else he must wait for another player to reach this cell 
	 *  or wait a given number of turns
	 *  we assume it's called once per turn
	 */
	boolean canBeLeft();

	/**
	 * returns the index of this cell
	 * @return the index of this cell
	 * */
	int getIndex();

	  /**
     * returns the index of the cell really reached by a player when the player
     *    reaches this cell.  For normal cells, the returned value equals
     *   <code>getIndex()</code> and is thus independent from
     *   <code>diceThrow</code>.
     * @param diceThrow the result of the dice when the player reaches this cell
     * @return the index of the actual cell where the player eventually
     * arrives when the given throw of dice sends the player in this cell
     */
	  int handleMove(int diceThrow);

	/**
	 * returns <tt>true</tt> if a player is in this cell
	 * @return <tt>true</tt> if a player is in this cell
	 * */
	boolean isBusy();

	 /**  handles what happens when a player arrives in this cell 
     * @param player the new player in the sell
     */
	 void welcomePlayer(Player player);

	/** gets the player in this cell <tt>null</tt> if none
	 * @return the player in this cell <tt>null</tt> if none
	 * */
	Player getPlayer();
}// Cell
