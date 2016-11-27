package goosegame;
/**
 * 
 * Abstract class of a Board
 *
 */
public abstract class Board {

	protected final int nbCells;
	protected Cell[] cells;
	
	
	/**
	 * Constructor
	 * @param nbCells Number of cells in the board minus the first one
	 */
	public Board(int nbCells) {
		this.nbCells = nbCells+1;
		cells = new Cell[this.nbCells];
	}
	
	/**
	 * Called to initialise the board
	 */
	public abstract void initBoard();
	
	
	/**
	 * Getter : get the cell at a given index
	 * @param i index of the cell
	 * @return
	 */
	public Cell getCell(int i){
		return cells[i];
	}
	
	/**
	 * Getter : get the number of cells in the board (include the cell 0)
	 * @return
	 */
	public int getNbCells() {
		return nbCells;
	}
	
}
