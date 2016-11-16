package goosegame.cells;

public class TrapCell extends BasicCell {

	public TrapCell(int i) {
		super(i);
	}
	
	@Override
	public boolean canBeLeft() {
		return false;
	}
	
}
