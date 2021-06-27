package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import javax.swing.*;

@SuppressWarnings({ "serial" })
public class Main extends Canvas implements Runnable, KeyListener {

	public static final int WIDTH = 900, HEIGTH = 600;
	//PLAYER
	Player p1 = new Player();
	//Timer
	float time = System.currentTimeMillis();
	

	public Main() {
		Dimension dimension = new Dimension(WIDTH,HEIGTH);
		this.setPreferredSize(dimension);		
	}
	
	public static void main(String[] args) {
		//JANELA
		Main game = new Main();
		JFrame window = new JFrame();
		window.add(game);
		window.setTitle("Mari0");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		
		//Start
		new Thread(game).start();
	}

	
	public void update(float time) {//
		//p1.setPx(p1.getPx() + p1.getVx());     
	    //p1.setPy(p1.getPy() + p1.getVy());      
	    //p1.setVy(p1.getGravity());
	
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
		g.setFont(new Font("Monospaced",Font.BOLD,20));
		g.drawString("LIFES: "+p1.getLifes(), WIDTH/5, HEIGTH/12);
		//Player
		g.setColor(Color.red);
		g.fillRect((int)p1.getPx(), (int)p1.getPy(), 50, 50);
		//SPRITES
		bs.show();
	}
	
	public void run() {
		while(true) {
			update(time);
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	//KEY EVENTS
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W){
			p1.jump();
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}