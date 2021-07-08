package main;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import display.Display;
import graphics.Assets;
import input.KeyManager;
import states.GameState;
import states.MenuState;
import states.State;


@SuppressWarnings("unused")
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
	
	//States
	private State gameState;
	private State menuState;	
	
	//Input
	private KeyManager keyManager;


	public Game(String title, int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init() {
		display = new Display(title, width, heigth);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		State.setState(gameState);
	}
	
	private void update() {
		keyManager.update();
		
		if(State.getState() != null) {
			State.getState().update();
		}
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
		g.drawImage(Assets.background, 0,0,null);
		
		 
		
		if(State.getState() != null) {
			State.getState().render(g);
		}
		
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
	
	public KeyManager getKeyManager() {
		return keyManager;
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
