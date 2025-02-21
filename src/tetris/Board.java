package tetris;
import java.awt.Color;
import java.awt.Point;
public class Board {
	
	private final int WIDTH = 10;
	private final int HEIGHT = 20;
	private Color[][] grid;
	
	public Board() {
		grid = new Color[HEIGHT][WIDTH];
	}
	
	public boolean canMove(Tetromino tetromino, int dx, int dy) {
		for(Point p : tetromino.getShape()) {
			int newX = p.x + dx;
			int newY = p.y + dy;
		}
	}
}
