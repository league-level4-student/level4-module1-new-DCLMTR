package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{
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
