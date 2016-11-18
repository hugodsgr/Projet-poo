package goosegame.cells;

import goosegame.Player;

public class StartCell extends BasicCell {

	public StartCell() {
		super(0);
	}
	
	@Override
	public boolean isBusy() {
		return false;
	}
	
	@Override
	public void welcomePlayer(Player player) {}
	
	@Override
	public String toString() {
		return "Start cell";
	}

}
