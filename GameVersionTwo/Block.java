package GameVersionTwo;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject{
	int size;
	Color color;
	
	public Block() {
		this.size = 0;
		this.color = Color.gray;
	}
	public Block(String id, int x, int y, int speed, int direction, Color color, int size) {
		super(id, x, y, speed, direction);
		this.color = color;
		this.size = size;
	}

	@Override
	public void update() {
		this.y = this.y + this.speed;
		if(this.y > 600) {
			this.y = -100;
		}
		
	}

	@Override
	public void render(Graphics g) {
	
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.size, this.size);
		
	}
}

