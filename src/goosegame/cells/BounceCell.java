package goosegame.cells;

public class BounceCell extends BasicCell{

	public BounceCell(int index) {
		super(index);
	}
	
	@Override
	public int handleMove(int diceThrow) {
		return index + 2 * diceThrow;
	}

}
