package com.life4nrg.base;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.life4nrg.components.Background;
import com.life4nrg.components.enemy.EnemyTank;
import com.life4nrg.components.player.PlayerTank;
import com.life4nrg.engine.GameEngine;


public class Window extends JPanel
{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	private GameEngine engine;
	
	private BufferedImage image;
	private Graphics2D g2D;
	
	private Background background;
	
	private PlayerTank player = new PlayerTank();
	private EnemyTank enemy = new EnemyTank();
	
	private List<PlayerTank> players = new ArrayList<>();
	private List<EnemyTank> enemies = new ArrayList<>();		
	
	
	
	public Window()
	{
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g2D =  (Graphics2D) image.getGraphics();
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		background = new Background();
		players.add(player);
		enemies.add(enemy);
		players.get(0).setEnemyTank(enemies.get(0));
		enemies.get(0).setPlayerTank(players.get(0));
		
		addKeyListener(players.get(0).getListener());
		addKeyListener(enemies.get(0).getListener());
	}
	
	public void start()
	{
		this.engine = new GameEngine(this);
		this.engine.start();
	}

	public void update() 
	{
		background.update();
		if(!players.isEmpty()){		
		players.get(0).update();
		}
		if(!enemies.isEmpty()){
		enemies.get(0).update();
		}
	}
	
	public void render()
	{
		background.draw(g2D);
		if(!players.isEmpty()){
			players.get(0).draw(g2D);
			if(enemy.isPlayerDead()){
				enemy.setPlayerDead(false);
				players.remove(0);
			}
		
		}
		if(!enemies.isEmpty()){
			enemies.get(0).draw(g2D);
			if(player.isEnemyDead()){
				enemies.remove(0);
				player.setEnemyDead(false);
			}
		}
	}
	
	public void drawWindow()
	{
		Graphics g = this.getGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();
	}
	
		
}
