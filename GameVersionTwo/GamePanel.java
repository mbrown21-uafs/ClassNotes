package GameVersionTwo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	Ball ball;
	Block block;
	Dimension dim;
	
	public GamePanel(Dimension dim){
		this.setSize(dim);
		this.setBackground(Color.black);
		ball = new Ball("ball1", 100,100,5,1,Color.red,50);
		block = new Block("block1", 400,100,3,1,Color.blue,100);
		
	}
	
	public void update() {
		ball.update();
		block.update();
		
	}
	
	public void render(Graphics g) {
		ball.render(g);
		block.render(g);
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.render(g);
		Toolkit.getDefaultToolkit().sync();
	}

	@Override
	public void run() {
		//Game Loop
		
		while(true) {
			this.update();
			this.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


