package goosegame;

import goosegame.cells.BasicCell;
import goosegame.cells.BounceCell;
import goosegame.cells.StartCell;
import goosegame.cells.TeleportCell;
import goosegame.cells.TrapCell;
import goosegame.cells.WaitCell;

public class ClassicBoard extends Board{

	public ClassicBoard() {
		super(63);
	}

	@Override
	public void initBoard() {
		cells[0] = new StartCell();
		for(int i=1; i< getNbCells(); i++){
			if(i == 31 || i == 52){
				cells[i] = new TrapCell(i);
			}else if(i == 19) cells[i] = new WaitCell(i, 2);
			else if(i == 6) cells[i] = new TeleportCell(i, 12);
			else if(i == 42) cells[i] = new TeleportCell(i, 30);
			else if(i == 58) cells[i] = new TeleportCell(i, 1);
			else if(i % 9 == 0 && i!= 63){
				cells[i] = new BounceCell(i);
			}else{
				cells[i] = new BasicCell(i);
			}
		}

	}

}
