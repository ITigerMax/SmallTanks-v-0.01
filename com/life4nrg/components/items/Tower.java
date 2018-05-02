package com.life4nrg.components.items;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Tower {
	
	private int r;
	
	private Tank tank;
	private Color color;
	
	public Tower(Tank tank){
		this.tank = tank;
		color = tank.getTankColor();
		r = 18;
	}
	
	public void drawVertical(Graphics2D draw) {
		draw.setColor(color);
		draw.fillOval(tank.getCenterX() - r, tank.getCenterY() - r, 2*r, 2*r);
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawOval(tank.getCenterX() - r, tank.getCenterY() - r, 2*r, 2*r);
		draw.drawOval(tank.getCenterX() + 4, tank.getCenterY() - 4, r/2, r/2);
		draw.drawOval(tank.getCenterX() - 12, tank.getCenterY() - 4, r/2, r/2);
	}
	
	public void drawHorizontal(Graphics2D draw) {
		draw.setColor(color);
		draw.fillOval(tank.getCenterX() - r, tank.getCenterY() - r, 2*r, 2*r);
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawOval(tank.getCenterX() - r, tank.getCenterY() - r, 2*r, 2*r);
		draw.drawOval(tank.getCenterX() - 4, tank.getCenterY() + 4, r/2, r/2);
		draw.drawOval(tank.getCenterX() - 4, tank.getCenterY() - 12, r/2, r/2);
	}
}
