package com.life4nrg.components.items;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Gun {

	private Tank tank;
	private Color color;

	public Gun(Tank tank) {
		this.tank = tank;
		this.color = tank.getTankColor();
	}
	
	public void drawVertical(Graphics2D draw) {
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(8));
		draw.drawLine(tank.getCenterX(),tank. getCenterY(), tank.getCenterX(), tank.getCenterY() - tank.getLength());
		draw.setStroke(new BasicStroke(5));
		draw.setColor(color);
		draw.drawLine(tank.getCenterX(),tank. getCenterY(), tank.getCenterX(), tank.getCenterY() - tank.getLength());
	}

	public void drawHorizontal(Graphics2D draw) {
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(8));
		draw.drawLine(tank.getCenterX(),tank. getCenterY(), tank.getCenterX() - tank.getLength(), tank.getCenterY());
		draw.setStroke(new BasicStroke(6));
		draw.setColor(color);
		draw.drawLine(tank.getCenterX(),tank. getCenterY(), tank.getCenterX() - tank.getLength(), tank.getCenterY());
	}
}
