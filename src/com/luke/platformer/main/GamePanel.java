package com.luke.platformer.main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(129, 128, 12, 24);
		g.fillOval(159, 128, 12, 24);
		g.drawOval(100, 100, 100, 100);
		g.drawArc(125, 160, 50, 14, 0, -180);
		Polygon poly = new Polygon();
		poly.addPoint(400, 400);
		poly.addPoint(450, 450);
		poly.addPoint(350, 450);
		g.fillPolygon(poly);
	}
}
