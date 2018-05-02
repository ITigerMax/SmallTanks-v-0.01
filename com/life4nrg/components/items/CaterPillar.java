package com.life4nrg.components.items;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class CaterPillar {

	private Tank tank;
	
	public CaterPillar(Tank tank) {
		this.tank = tank;
	}
	
	
	public void drawVertical(Graphics2D draw) {
		drawLeftVertical(draw);
		drawRightVertical(draw);
	}
	
	public void drawHorizontal(Graphics2D draw) {
		drawLeftHorizontal(draw);
		drawRightHorizontal(draw);
	}
	
	private void drawLeftVertical(Graphics2D draw) {
	draw.setColor(Color.BLACK);
	draw.setStroke(new BasicStroke(2));
	draw.drawRect(tank.getX(), tank.getY(), tank.getWidth() - 65, tank.getHeight());
	draw.drawLine(tank.getX(), tank.getY() + 5, tank.getX() + 15, tank.getY() + 5);
	draw.drawLine(tank.getX(), tank.getY() + 10, tank.getX() + 15, tank.getY() + 10);
	draw.drawLine(tank.getX(), tank.getY() + 15, tank.getX() + 15, tank.getY() + 15);
	draw.drawLine(tank.getX(), tank.getY() + 20, tank.getX() + 15, tank.getY() + 20);
	draw.drawLine(tank.getX(), tank.getY() + 25, tank.getX() + 15, tank.getY() + 25);
	draw.drawLine(tank.getX(), tank.getY() + 30, tank.getX() + 15, tank.getY() + 30);
	draw.drawLine(tank.getX(), tank.getY() + 35, tank.getX() + 15, tank.getY() + 35);
	draw.drawLine(tank.getX(), tank.getY() + 40, tank.getX() + 15, tank.getY() + 40);
	draw.drawLine(tank.getX(), tank.getY() + 45, tank.getX() + 15, tank.getY() + 45);
	}
	
	private void drawRightVertical(Graphics2D draw) {
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawRect(tank.getX() + 65, tank.getY(), tank.getWidth() - 65, tank.getHeight());
		draw.drawLine(tank.getX() + 65, tank.getY() + 5, tank.getX() + 80, tank.getY() + 5);
		draw.drawLine(tank.getX() + 65, tank.getY() + 10, tank.getX() + 80, tank.getY() + 10);
		draw.drawLine(tank.getX() + 65, tank.getY() + 15, tank.getX() + 80, tank.getY() + 15);
		draw.drawLine(tank.getX() + 65, tank.getY() + 20, tank.getX() + 80, tank.getY() + 20);
		draw.drawLine(tank.getX() + 65, tank.getY() + 25, tank.getX() + 80, tank.getY() + 25);
		draw.drawLine(tank.getX() + 65, tank.getY() + 30, tank.getX() + 80, tank.getY() + 30);
		draw.drawLine(tank.getX() + 65, tank.getY() + 35, tank.getX() + 80, tank.getY() + 35);
		draw.drawLine(tank.getX() + 65, tank.getY() + 40, tank.getX() + 80, tank.getY() + 40);
		draw.drawLine(tank.getX() + 65, tank.getY() + 45, tank.getX() + 80, tank.getY() + 45);
	}
	
	private void drawLeftHorizontal(Graphics2D draw) {
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawRect(tank.getX(), tank.getY() + 65, tank.getWidth(), tank.getHeight() - 65);
		draw.drawLine(tank.getX() + 5, tank.getY() + 65, tank.getX() + 5, tank.getY() + 80);
		draw.drawLine(tank.getX() + 10, tank.getY() + 65, tank.getX() + 10, tank.getY() + 80);
		draw.drawLine(tank.getX() + 15, tank.getY() + 65, tank.getX() + 15, tank.getY() + 80);
		draw.drawLine(tank.getX() + 20, tank.getY() + 65, tank.getX() + 20, tank.getY() + 80);
		draw.drawLine(tank.getX() + 25, tank.getY() + 65, tank.getX() + 25, tank.getY() + 80);
		draw.drawLine(tank.getX() + 30, tank.getY() + 65, tank.getX() + 30, tank.getY() + 80);
		draw.drawLine(tank.getX() + 35, tank.getY() + 65, tank.getX() + 35, tank.getY() + 80);
		draw.drawLine(tank.getX() + 40, tank.getY() + 65, tank.getX() + 40, tank.getY() + 80);
		draw.drawLine(tank.getX() + 45, tank.getY() + 65, tank.getX() + 45, tank.getY() + 80);
	}
	

	
	private void drawRightHorizontal(Graphics2D draw){
		draw.setColor(Color.BLACK);
		draw.setStroke(new BasicStroke(2));
		draw.drawRect(tank.getX(), tank.getY(), tank.getWidth(), tank.getHeight() - 65);
		draw.drawLine(tank.getX() + 5, tank.getY(), tank.getX() + 5, tank.getY() + 15);
		draw.drawLine(tank.getX() + 10, tank.getY(), tank.getX() + 10, tank.getY() + 15);
		draw.drawLine(tank.getX() + 15, tank.getY(), tank.getX() + 15, tank.getY() + 15);
		draw.drawLine(tank.getX() + 20, tank.getY(), tank.getX() + 20, tank.getY() + 15);
		draw.drawLine(tank.getX() + 25, tank.getY(), tank.getX() + 25, tank.getY() + 15);
		draw.drawLine(tank.getX() + 30, tank.getY(), tank.getX() + 30, tank.getY() + 15);
		draw.drawLine(tank.getX() + 35, tank.getY(), tank.getX() + 35, tank.getY() + 15);
		draw.drawLine(tank.getX() + 40, tank.getY(), tank.getX() + 40, tank.getY() + 15);
		draw.drawLine(tank.getX() + 45, tank.getY(), tank.getX() + 45, tank.getY() + 15);
	}


	
}
