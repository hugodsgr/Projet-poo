package goosegame.cells;

import goosegame.Player;

public class WaitCell extends BasicCell{

	private int waitTime;
	private int currentWait;
	
	public WaitCell(int index, int waitTime) {
		super(index);
		this.waitTime = waitTime;
		this.currentWait = 0;
	}
	
	@Override
	public boolean canBeLeft() {
		return currentWait++ >= waitTime;
	}
	
	@Override
	public void welcomePlayer(Player player) {
		super.welcomePlayer(player);
		currentWait = 0;
	}

}
