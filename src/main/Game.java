package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import display.Display;
import graphics.Assets;


public class Game implements Runnable {

	//Display
	private Display display;
	private int width,heigth;
	public String title;
	//Thread
	private boolean running = false;
	private Thread thread;
	//Graphics
	private BufferStrategy bs;
	private Graphics g;
	//Player
	Player p1 = new Player();

	
	public Game(String title, int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
		this.title = title;
	}

//-------------------------------THREAD-------------------------------	
	private void init() {
		display = new Display(title, width, heigth);
		Assets.init();
	}
	
	private void update() {

	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		//Limpa a tela
		g.clearRect(0, 0, width, heigth);
		//BACKGROUND
		g.fillRect(0, 0, width, heigth);
		//Player
		g.drawImage(Assets.player, p1.getPx(),p1.getPy(),null);
		
		//Inicia os graficos
		bs.show();
		g.dispose();
	}
	@Override
	public void run() {
		init();
		
		int fps = 60;
		double timePerUpdate = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerUpdate;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				update();
				render();
				ticks++;
				delta--;
			}
			if(timer >= 1000000000) {
				System.out.println("FPS:"+ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
	}
	
	public synchronized void start() {
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running) return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	

}
