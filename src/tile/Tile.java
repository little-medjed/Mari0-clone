package tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//Static
	public static Tile[] tiles = new Tile[256];
	public static Tile floor= new FloorTile(0);
	public static Tile plateUp = new PlateUpTile(1);
	public static Tile plateDown = new PlateDownTile(2);
	
	//Class
	protected BufferedImage texture;
	protected final int ID;
	private static final int TILE_WIDTH = 32,TILE_HEIGTH = 32;
	
	public Tile(BufferedImage texture, int ID) {
		this.texture = texture;
		this.ID = ID;
		
		tiles[ID] = this;
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
