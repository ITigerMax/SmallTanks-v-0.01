package com.life4nrg.components.items;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bullet {

	private int x;
	private int y;
	private int r;
	private int speed;
	
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	
	private Color color1;
	private Color color2;
	
	public Bullet(Tank tank) {
		this.color1 = Color.YELLOW;
		this.color2 = Color.BLACK.brighter();
		
		r = 7;
		speed = 20;
		
		if(tank.isVertUp()){
			up = true;
			x = tank.getX() + tank.getWidth() / 2 - 2;
			y = tank.getY() - 35;
		}
		if(tank.isVertDown()){
			down = true;
			x = tank.getX() + tank.getWidth() / 2 - 2;
			y = tank.getY() + 75;
		}
		if(tank.isHorLeft()){
			left = true;
			x = tank.getX() - 35;
			y = tank.getY() + tank.getHeight() / 2 - 4;
		}
		if(tank.isHorRight()){
			right = true;
			x = tank.getX() + 75;
			y = tank.getY() + tank.getHeight() / 2 - 4;
		}
	}
	
	public void draw(Graphics2D draw) {
		
		if(up){
			draw.setColor(color1);
			draw.fillOval(x, y, r, r + 5);
			draw.setColor(color2);
			draw.drawOval(x, y, r, r + 5);
		}
		if(down){
			down = true;
			draw.setColor(color1);
			draw.fillOval(x, y, r, r + 5);
			draw.setColor(color2);
			draw.drawOval(x, y, r, r + 5);
		}
		if(left){
			draw.setColor(color1);
			draw.fillOval(x, y, r + 5, r);
			draw.setColor(color2);
			draw.drawOval(x, y, r + 5, r);
		}
		if(right){
			draw.setColor(color1);
			draw.fillOval(x, y, r + 5, r);
			draw.setColor(color2);
			draw.drawOval(x, y, r + 5, r);
		}
	}
	
	public void update() {
		if(up){
			y -= speed;
		}
		if(down){
			y += speed;
		}
		if(left){
			x -= speed;
		}
		if(right){
			x += speed;
		}
	}
	
	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
