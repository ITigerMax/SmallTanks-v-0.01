package com.life4nrg.components.items;

import java.awt.Color;
import java.awt.Graphics2D;

import com.life4nrg.base.Window;

public class Tank {
	
	private static int pos = 0;
	
	private int x;
	private int y;
	private int speed;
	private int centerX;
	private int centerY;
	private int length;
	private int width;
	private int height;
	private boolean isMoveUp;
	private boolean isMoveDown;
	private boolean isMoveLeft;
	private boolean isMoveRight;
	private boolean isVertUp;
	private boolean isVertDown;
	private boolean isHorLeft;
	private boolean isHorRight;
	
	private boolean isFire;

	private Color tankColor;
	private TankBody body; 
	private Gun gun;
	private Tower tower;
	private CaterPillar caterPillar;


	public Tank(int x, int y, Color color){
		this.speed = 5;
		this.x = x;
		this.y = y;
		if(pos == 0){
		this.isVertUp = true;
		}else{
			this.isVertDown = true;
		}
		tankColor = color;
		body = new TankBody(this);
		gun = new Gun(this);
		tower = new Tower(this);
		caterPillar = new CaterPillar(this);
		pos++;
	}
	
	
	public void draw(Graphics2D g2d) {
		
		body.draw(g2d);
		if(isVertUp || isVertDown){
			gun.drawVertical(g2d);
			tower.drawVertical(g2d);
			caterPillar.drawVertical(g2d);
		}
		
		if(isHorLeft || isHorRight){
			gun.drawHorizontal(g2d);
			tower.drawHorizontal(g2d);
			caterPillar.drawHorizontal(g2d);
		}
		
	
	}
	
	public void update() {
		rotate();
		if(isMoveUp && y >= 20){
			y -= speed;
			centerY -= speed;
		}
		if(isMoveDown && y <= Window.HEIGHT - 75){
			y +=speed;
			centerY += speed;
		}
		if(isMoveLeft && x >= 20){
			x -= speed;
			centerX -= speed;
		}
		if(isMoveRight && x <= Window.WIDTH - 75){
			x += speed;
			centerX += speed;
		}
		
	}
	
	private void rotate() {
		if(isVertUp) {
			this.length = 40;
			width = 80;
			height  = 50;
			this.centerX = x + width / 2;
			this.centerY = y + height / 2;
		}
		if(isVertDown) {
			this.length = -40;
			width = 80;
			height  = 50;
			this.centerX = x + width / 2;
			this.centerY = y + height / 2;
		}
		if(isHorRight){
			this.length = -40;
			width = 50;
			height  = 80;
			this.centerX = x + width / 2;
			this.centerY = y + height / 2;
		}
		if(isHorLeft){
			this.length = 40;
			width = 50;
			height  = 80;
			this.centerX = x + width / 2;
			this.centerY = y + height / 2;
		}
	}
	
	
	//Getters&Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getCenterX() {
		return centerX;
	}


	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}


	public int getCenterY() {
		return centerY;
	}


	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public boolean isMoveUp() {
		return isMoveUp;
	}


	public void setMoveUp(boolean isMoveUp) {
		this.isMoveUp = isMoveUp;
	}
	
	public boolean isMoveDown() {
		return isMoveDown;
	}


	public void setMoveDown(boolean isMoveDown) {
		this.isMoveDown = isMoveDown;
	}


	public boolean isMoveLeft() {
		return isMoveLeft;
	}


	public void setMoveLeft(boolean isMoveLeft) {
		this.isMoveLeft = isMoveLeft;
	}


	public boolean isMoveRight() {
		return isMoveRight;
	}


	public void setMoveRight(boolean isMoveRight) {
		this.isMoveRight = isMoveRight;
	}


	public boolean isVertUp() {
		return isVertUp;
	}


	public void setVertUp(boolean isVertUp) {
		this.isVertUp = isVertUp;
	}


	public boolean isVertDown() {
		return isVertDown;
	}


	public void setVertDown(boolean isVertDown) {
		this.isVertDown = isVertDown;
	}


	public boolean isHorLeft() {
		return isHorLeft;
	}


	public void setHorLeft(boolean isHorLeft) {
		this.isHorLeft = isHorLeft;
	}


	public boolean isHorRight() {
		return isHorRight;
	}


	public void setHorRight(boolean isHorRight) {
		this.isHorRight = isHorRight;
	}
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	public Color getTankColor() {
		return tankColor;
	}
	public boolean isFire() {
		return isFire;
	}


	public void setFire(boolean isFire) {
		this.isFire = isFire;
	}
}
