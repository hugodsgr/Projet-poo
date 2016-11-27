package goosegame.cells;

/**
 * Implementation of the Teleport cell, extends {@link BasicCell}
 */
public class TeleportCell extends BasicCell {

	private int teleportIndex;

	/**
	 * Constructor
	 * @param index the index of this cell
	 * @param teleportIndex the index of the cell at the end of the teleportation
     */
	public TeleportCell(int index, int teleportIndex) {
		super(index);
		this.teleportIndex = teleportIndex;
	}

	/**
	 * Always return the index of the cell at the end of the teleportation
	 * @param diceThrow the parameter doesn't matter
	 * @return the index of the cell at the end of the teleportation
     */
	@Override
	public int handleMove(int diceThrow) {
		return teleportIndex;
	}
	
	@Override
	public String toString() {
		return "Teleport cell";
	}

}
