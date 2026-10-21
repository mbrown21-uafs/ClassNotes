package GameVersionTwo;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Game {
	protected JFrame window;
	protected GamePanel panel;
	protected Dimension dim;
	Thread gameLoop;
	
	
	
	public Game() {
		window = new JFrame("My Game");
		dim = new Dimension(800,800);
		window.setSize(dim);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		panel = new GamePanel(dim);
		window.add(panel);
		
	}
	
	public void run() {
		gameLoop = new Thread(this.panel);
		window.setVisible(true);
		gameLoop.start();
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}
	
}
