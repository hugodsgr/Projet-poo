package goosegame.cells;

import goosegame.Cell;
import goosegame.Player;

public class BasicCell implements Cell{
	
	protected int index;
	private Player player;
	
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
		return index + diceThrow;
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

}
