import goosegame.Board;
import goosegame.ClassicBoard;
import goosegame.Game;
import goosegame.Player;

public class Main {

	
	public static void main(String[] args){
		Board b = new ClassicBoard();
		b.initBoard();
		Player p1 = new Player("P1", b.getCell(0));
		Player p2 = new Player("P2", b.getCell(0));
		Player p3 = new Player("P3", b.getCell(0));
		
		
		Game g = new Game(b);
		g.addPlayer(p1);
		g.addPlayer(p2);
		g.addPlayer(p3);
		
		g.play();
	}
}
