package goosegame.cells;

/**
 * Bounce Cell implementation it extends {@link BasicCell}
 */
public class BounceCell extends BasicCell{

	/**
	 * Constructor
	 * @param index index of this cell
     */
	public BounceCell(int index) {
		super(index);
	}

	/**
	 * it's a bounce cell so it returns the cell after the bounce
	 * @param diceThrow the dice throw
	 * @return the index of the cell after bouncing
     */
	@Override
	public int handleMove(int diceThrow) {
		return index +  diceThrow;
	}

	@Override
	public String toString() {
		return "Bounce cell";
	}
}
