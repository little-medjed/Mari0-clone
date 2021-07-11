package entities;

import java.awt.Graphics;

public abstract class Entity {
	
	protected float posX, posY;
	protected int width, heigth;
	protected int life;
	
	public Entity(float posX, float posY, int width, int heigth, int life) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.heigth = heigth;
		this.life = life;
	}
	
	public abstract void update();
	
	public abstract void render(Graphics g);

//=======================GETTERS E SETTERS=======================
	
	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	
	
}
