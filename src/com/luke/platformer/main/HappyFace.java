package com.luke.platformer.main;

import javax.swing.JFrame;

public class HappyFace {

	public static void main(String args[]) {
		JFrame window = new JFrame("SimpleGraphicsProgram");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
}
