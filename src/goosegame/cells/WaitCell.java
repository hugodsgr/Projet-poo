package goosegame.cells;

import goosegame.Player;

/**
 * implmentation of the wait cell, extends {@link BasicCell}
 */
public class WaitCell extends BasicCell{

	private int waitTime;
	private int currentWait;

	/**
	 * Constructor
	 * @param index index of this cell
	 * @param waitTime the number of turn a player has to wait when arriving on this cell
     */
	public WaitCell(int index, int waitTime) {
		super(index);
		this.waitTime = waitTime;
		this.currentWait = 0;
	}

	/**
	 * this method, is called once per turn, so we use it to know how many turns a player has been on this cell
	 * @return <code>True</code> if the player has been wiating long enough on this cell
     */
	@Override
	public boolean canBeLeft() {
		return currentWait++ >= waitTime;
	}
	
	@Override
	public void welcomePlayer(Player player) {
		super.welcomePlayer(player);
		currentWait = 0;
	}
	
	@Override
	public String toString() {
		return "Wait cell";
	}

}
