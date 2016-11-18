package goosegame.cells;

import goosegame.Player;

public class TrapCell extends BasicCell {

	public TrapCell(int i) {
		super(i);
	}
	
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
