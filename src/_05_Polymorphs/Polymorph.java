package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public abstract void update();

	public abstract void draw(Graphics g);
}
	class MovingPoly extends Polymorph
	{
		public MovingPoly(int x, int y, int width, int height){
			super(x, y, width, height);
		}
		public void update() {
			x+=10;
			y+=10;
		}
		
		public void draw(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(x, y, width, height);
		}

	}
	class BluePolymorph extends Polymorph
	{
		public BluePolymorph(int x, int y, int width, int height) {
			super(x, y, width, height);
		}
		public void draw(Graphics g) {
			g.setColor(Color.blue);
			g.fillRect(x, y, width, height);
		}

	    public void update() {
	        
	    }
	}
	class RedPolymorph extends Polymorph
	{
		public RedPolymorph(int x, int y, int width, int height) {
			super(x, y, width, height);
		}

		public void update() {
			
		}

		public void draw(Graphics g) {
			g.setColor(Color.RED);
			g.fillRect(x, y, width, height);
		}
	}

