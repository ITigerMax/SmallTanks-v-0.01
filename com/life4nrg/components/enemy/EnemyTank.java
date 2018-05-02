package com.life4nrg.components.enemy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import com.life4nrg.base.Window;
import com.life4nrg.components.items.Bullet;
import com.life4nrg.components.items.Tank;
import com.life4nrg.components.player.PlayerTank;

public class EnemyTank {
	private int x;
	private int y;
	private Tank tank;
	private Color colorTank; 
	private int up;
	private int down;
	private int left;
	private int right;
	private int fire;
	
	private boolean isFire;
	private boolean isPlayerDead;
	
	private List<Bullet> bullets = new ArrayList<>();
	private PlayerTank playerTank;
	
	public EnemyTank() {
		this.x = (Window.WIDTH / 2) - 350;
		this.y = (Window.HEIGHT / 2) - 250;
		colorTank = Color.YELLOW.darker();
		tank = new Tank(x, y, colorTank);
		this.up = KeyEvent.VK_UP;
		this.down = KeyEvent.VK_DOWN;
		this.left = KeyEvent.VK_LEFT;
		this.right = KeyEvent.VK_RIGHT;
		fire = KeyEvent.VK_L;
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
			if(bullet.getX() >= playerTank.getTank().getX() && 
					bullet.getX() <= playerTank.getTank().getX() + playerTank.getTank().getWidth() &&
					bullet.getY() >= playerTank.getTank().getY() &&
					bullet.getY() <= playerTank.getTank().getY() + playerTank.getTank().getHeight()) {
				isPlayerDead = true;
				bullets.remove(0);
				isFire = false;
			}
		}
	}
	
	public Tank getTank() {
		return tank;
	}
	
	public void setTank(Tank tank) {
		this.tank = tank;
	}
	
	public Listener getListener() {
		return new Listener(tank);
	}
	
	public void setPlayerTank(PlayerTank player) {
		this.playerTank = player;
	}
	
	public boolean isPlayerDead() {
		return isPlayerDead;
	}

	public void setPlayerDead(boolean isPlayerDead) {
		this.isPlayerDead = isPlayerDead;
	}

	
	private class Listener implements KeyListener {
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
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
}

