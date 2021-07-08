package tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	
	protected BufferedImage texture;
	protected final int ID;
	private static final int TILE_WIDTH = 32,TILE_HEIGTH = 32;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.ID = id;
		
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGTH, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getID() {
		return ID;
	}

}
