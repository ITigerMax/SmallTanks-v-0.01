package com.life4nrg.engine;

import com.life4nrg.base.Window;

public class GameEngine extends Thread
{
	private Window window;
	
	public GameEngine(Window window) 
	{
		this.window = window;
	}

	
	public void run()
	{
		window.setFocusable(true);
		window.requestFocus();
		
		while (true) 
		{
			try
			{
				Thread.sleep(33);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			window.update();
			window.render();
			window.drawWindow();
			
		}
	}
}
