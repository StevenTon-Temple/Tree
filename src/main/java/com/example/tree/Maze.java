package com.example.maze;

import javax.swing.*;

public class Maze extends JFrame {

	public Maze() {
		
		this.add(new MazeGridPanel(10,10));
		this.setSize(800, 800);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
			new Maze();

	}
}