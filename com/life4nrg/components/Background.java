package com.life4nrg.components;

import java.awt.Color;
import java.awt.Graphics2D;

import com.life4nrg.base.Window;

public class Background {

	private int width;
	private int height; 
	
	private Color color;
	
	public Background() {
		this.width = Window.WIDTH;
		this.height = Window.HEIGHT;
		this.color = Color.BLUE;
	}
	
	public void update()
	{
		
	}
	
	public void draw(Graphics2D g2D){
		g2D.setColor(color);
		g2D.fillRect(0, 0, width, height);
	}
}
