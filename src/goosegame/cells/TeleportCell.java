package goosegame.cells;

public class TeleportCell extends BasicCell {

	private int teleportIndex;
	
	public TeleportCell(int index, int teleportIndex) {
		super(index);
		this.teleportIndex = teleportIndex;
	}
	
	@Override
	public int handleMove(int diceThrow) {
		return teleportIndex;
	}
	
	@Override
	public String toString() {
		return "Teleport cell";
	}

}
