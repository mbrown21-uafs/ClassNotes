package GameVersionTwo;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
	Color color;
	int size;
	
	public Ball() {
		this.color = Color.gray;
		this.size = 0;
		
	}
	public Ball(String id, int x, int y, int speed, int direction, Color color, int size) {
		super(id, x, y, speed, direction);
		this.color = color;
		this.size = size;
	}

	@Override
	public void update() {
		
		this.x = this.x + this.speed;
		if(x >= 800) {
			this.x = -100;
		}
		
	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(this.color);
		g.fillOval(this.x, this.y, this.size, this.size);
		
		
	}
	
	@Override
	public void show() {
		super.show();
		System.out.printf("Size: %d Color: %s\n", this.size, this.color.toString());
	}

}
