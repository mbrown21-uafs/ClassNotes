package GameVersionTwo;

import java.awt.Graphics;

public abstract class GameObject {
	 protected String id;
	 protected int x;
	 protected int y;
	 protected int direction;
	 protected int speed;
	
	public GameObject() {
		this.id = "";
		this.x = 0;
		this.y = 0;
		this.direction = 0;
		this.speed = 0;
	}
	
	public GameObject(String id, int x, int y, int speed, int direction) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.direction = direction;
	}
	
	public void show() {
		System.out.printf("Id: %s (%d,%d) Speed: %d Direction: %d\n", 
				this.id, this.x, this.x, this.speed, this.direction);
		
	}
	
	public abstract void update();
	public abstract void render(Graphics g);
	
}
