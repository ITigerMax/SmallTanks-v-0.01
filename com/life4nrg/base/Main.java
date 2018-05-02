package com.life4nrg.base;

import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setLocation(225, 50);
		mainFrame.setResizable(false);
	
		Window mainWindow = new Window();
		mainFrame.setContentPane(mainWindow);
		mainFrame.pack();
		mainWindow.start();
	}
}
