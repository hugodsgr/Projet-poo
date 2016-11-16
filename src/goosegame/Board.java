package goosegame;

public abstract class Board {

	protected final int nbCells;
	protected Cell[] cells;
	
	
	public Board(int nbCells) {
		this.nbCells = nbCells+1;
		cells = new Cell[this.nbCells];
	}
	
	public abstract void initBoard();
	
	public Cell getCell(int i){
		return cells[i];
	}
	
	public int getNbCells() {
		return nbCells;
	}
	
}
