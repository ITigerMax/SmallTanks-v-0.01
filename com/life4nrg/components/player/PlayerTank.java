package com.life4nrg.components.player;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import com.life4nrg.base.Window;
import com.life4nrg.components.enemy.EnemyTank;
import com.life4nrg.components.items.Bullet;
import com.life4nrg.components.items.Tank;

public class PlayerTank{
	private int x;
	private int y;
	private Tank tank;
	private Color colorTank;
	private int up;
	private int down;
	private int left;
	private int right;
	private int fire;
	private EnemyTank enemyTank;
	
	private boolean isFire;
	private boolean isEnemyDead;
	
	private List<Bullet> bullets = new ArrayList<>();
	
	
	public PlayerTank() {
		this.x = (Window.WIDTH / 2) + 250;
		this.y = (Window.HEIGHT / 2) + 200;
		colorTank = Color.GREEN.darker();
		tank = new Tank(x, y, colorTank);
		this.up = KeyEvent.VK_W;
		this.down = KeyEvent.VK_S;
		this.left = KeyEvent.VK_A;
		this.right = KeyEvent.VK_D;
		fire = KeyEvent.VK_F;
	}
	
	public void draw(Graphics2D g2d) {
		tank.draw(g2d);
		if(isFire){
			if(bullets.isEmpty()) {
				bullets.add(new Bullet(tank));
			}
				bullets.get(0).draw(g2d);
			
		}
		
	}
	
	public void update(){
		tank.update();
		if(!bullets.isEmpty()){
			Bullet bullet = bullets.get(0);
			bullet.update();
			if(bullet.getX() < -5 || bullet.getX() > (Window.WIDTH + 5)
					|| bullet.getY() < -5 || bullet.getY() > (Window.HEIGHT + 5)){
				bullets.remove(0);
				isFire = false;
			}
			if(bullet.getX() >= enemyTank.getTank().getX() && 
					bullet.getX() <= enemyTank.getTank().getX() + enemyTank.getTank().getWidth() &&
					bullet.getY() >= enemyTank.getTank().getY() &&
					bullet.getY() <= enemyTank.getTank().getY() + enemyTank.getTank().getHeight()) {
				isEnemyDead = true;
				bullets.remove(0);
				isFire = false;
			}
		}
	
	}
	
	
	
	public Tank getTank() {
		return tank;
	}
	
	public Listener getListener() {
		return new Listener(tank);
	}
	
	public void setEnemyTank(EnemyTank enemy) {
		this.enemyTank = enemy;
	}
	
	public boolean isEnemyDead(){
		return isEnemyDead;
	}
	
	public void setEnemyDead(boolean isEnemyDead){
		this.isEnemyDead = isEnemyDead;
	}
	
	private class Listener implements KeyListener{
		
		private Tank tank;
		
		private Listener(Tank tank) {
			this.tank = tank;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if(key == up) {
				tank.setVertUp(true);
				tank.setVertDown(false);
				tank.setHorLeft(false);
				tank.setHorRight(false);
				tank.setMoveUp(true);
				tank.setMoveDown(false);
				tank.setMoveLeft(false);
				tank.setMoveRight(false);
			}
			if(key == down) {
				tank.setVertUp(false);
				tank.setVertDown(true);
				tank.setHorLeft(false);
				tank.setHorRight(false);
				tank.setMoveUp(false);
				tank.setMoveDown(true);
				tank.setMoveLeft(false);
				tank.setMoveRight(false);
			}
			if(key == left) {
				tank.setVertUp(false);
				tank.setVertDown(false);
				tank.setHorLeft(true);
				tank.setHorRight(false);
				tank.setMoveUp(false);
				tank.setMoveDown(false);
				tank.setMoveLeft(true);
				tank.setMoveRight(false);
			}
			if(key == right) {
				tank.setVertUp(false);
				tank.setVertDown(false);
				tank.setHorLeft(false);
				tank.setHorRight(true);
				tank.setMoveUp(false);
				tank.setMoveDown(false);
				tank.setMoveLeft(false);
				tank.setMoveRight(true);
			}
			if(key == fire){
				isFire = true;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			if(key == up) {
				tank.setMoveUp(false);
			}
			if(key == down) {
				tank.setMoveDown(false);
			}
			if(key == left) {
				tank.setMoveLeft(false);
			}
			if(key == right) {
				tank.setMoveRight(false);
			}
		}


		@Override
		public void keyTyped(KeyEvent e) {
		
		}
		
	}
}
