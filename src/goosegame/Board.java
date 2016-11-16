package goosegame;

public abstract class Board {

	private final int nbCells;
	private Cell[] cells;
	
	
	public Board(int nbCells) {
		this.nbCells = nbCells+1;
	}
	
	public abstract void initBoard();
	
	public Cell getCell(int i){
		return cells[i];
	}
	
	public int getNbCells() {
		return nbCells;
	}
	
}
