package main;


public class Player {
	private int px = 50,py = 300;
	private int vx = 15, vy = -15;
	private float gravity = -0.5f;
	private int lifes = 3;
	
	
	public void walkRight() {
		if(px <= 800) {
			this.setPx(px+vx);
		}
		
	}
	public void walkLeft() {
		if(px >= 50) {
			this.setPx(px-vx);
		}
	}
	
	public void jump() {	
		if(py >= 350) {
			py += vy; 
		}	
		
	}
	
	public void portalBlue() {
		
	}
	
	public void portalOrange() {
		
	}
	
	public void carryBox() {
		
	}

////////////GETS E SETS////////////
	
	public int getPx() {
		return px;
	}
	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}
	public void setPy(int py) {
		this.py = py;
	}

	public int getVx() {
		return vx;
	}
	public void setVx(int vx) {
		this.vx = vx;
	}

	public int getVy() {
		return vy;
	}
	public void setVy(int vy) {
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
