package main;

public class Player {
	private float px = 50,py = 400;
	private float vx = 25, vy = -100;
	private float gravity = 0.5f;
	private int lifes = 3;
	
	public void walk() {
		this.setPx(px+vx);
	}
	
	public void jump() {
		this.setPy(py+vy);
	}
	
	public void portalBlue() {
		
	}
	
	public void portalOrange() {
		
	}
	
	public void carryBox() {
		
	}

////////////GETS E SETS////////////
	
	public float getPx() {
		return px;
	}
	public void setPx(float px) {
		this.px = px;
	}

	public float getPy() {
		return py;
	}
	public void setPy(float py) {
		this.py = py;
	}

	public float getVx() {
		return vx;
	}
	public void setVx(float vx) {
		this.vx = vx;
	}

	public float getVy() {
		return vy;
	}
	public void setVy(float vy) {
		this.vy = vy;
	}

	public float getGravity() {
		return gravity;
	}
	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	public int getLifes() {
		return lifes;
	}
	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
	
}
