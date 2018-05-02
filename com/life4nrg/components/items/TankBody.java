package com.life4nrg.components.items;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class TankBody {
	
	private Tank tank;
	
	private Color color;
	
	public TankBody(Tank tank){
		this.tank = tank;
		color = tank.getTankColor();
	}
	
	public void draw(Graphics2D draw) {
		draw.setColor(color);
		draw.fillRect(tank.getX(), tank.getY(), tank.getWidth(), tank.getHeight());
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawRect(tank.getX(), tank.getY(), tank.getWidth(), tank.getHeight());
	}


	
}
