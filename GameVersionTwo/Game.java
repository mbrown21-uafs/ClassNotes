package GameVersionTwo;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Game {
	protected JFrame window;
	protected Dimension dim;
	
	
	
	public Game() {
		window = new JFrame("My Game");
		dim = new Dimension(800,800);
		window.setSize(dim);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		
	}
	
	public void run() {
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}
	
}
