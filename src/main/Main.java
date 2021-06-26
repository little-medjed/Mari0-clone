package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;

import javax.swing.*;

@SuppressWarnings({ "unused", "serial" })
public class Main extends Canvas implements Runnable{

	public static final int WIDTH = 800, HEIGTH = 600;
	
	public Main() {
		Dimension dimension = new Dimension(WIDTH,HEIGTH);
		this.setPreferredSize(dimension);		
	}
	
	public static void main(String[] args) {
		Main game = new Main();
		JFrame window = new JFrame();
		window.add(game);
		window.setTitle("Mari0");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		
		new Thread(game).start();
	}

	
	public void update() {
		System.out.println("lolol");
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		//BACKGROUND
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGTH);
		//LIFE CONTER		
		g.setColor(Color.white);
		g.setFont(new Font("Arial",Font.BOLD,22));
		g.drawString("LIFES: 3", WIDTH/5, HEIGTH/12);
		//SPRITES
		bs.show();
	}
	
	public void run() {
		while(true) {
			update();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
}