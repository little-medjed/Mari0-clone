package tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//Static
	public static Tile[] tiles = new Tile[256];
	public static Tile empty = new EmptyTile(0);
	public static Tile floor= new FloorTile(1);
	public static Tile plateUp = new PlateUpTile(2);
	public static Tile plateDown = new PlateDownTile(3);
	
	
	//Class
	protected BufferedImage texture;
	protected final int ID;
	public static final int TILE_WIDTH = 32,TILE_HEIGHT = 32;
	
	public Tile(BufferedImage texture, int ID) {
		this.texture = texture;
		this.ID = ID;
		
		tiles[ID] = this;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getID() {
		return ID;
	}

}
