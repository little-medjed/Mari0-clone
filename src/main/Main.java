package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Main extends JFrame{

	public Main() {
		
		this.setTitle("Mari0");
		this.setSize(1024,728);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}
	
	public static void main(String[] args) {
		
		Main window = new Main();
		window.setVisible(true);
		
	}

}