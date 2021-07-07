package main;


public class Player {
	private float px = 50,py = 450;
	private float vx = 15, vy = -15.0f;
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
