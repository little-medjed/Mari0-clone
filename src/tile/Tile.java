package tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//Tiles Criados
	public static Tile[] tiles = new Tile[256];
	public static Tile empty = new EmptyTile(0);
	public static Tile floor= new FloorTile(1);
	public static Tile plateUp = new PlateUpTile(2);
	public static Tile plateDown = new PlateDownTile(3);
	public static Tile door = new Door(4);
	public static Tile meGrill = new MEGrill(5);
	public static Tile button1 = new Button1(6);
	public static Tile button2 = new Button2(7);
	public static Tile box = new Box(8);
	
	public static Tile elevB1 = new ElevB1(9);
	public static Tile elevB2 = new ElevB2(10);
	
	public static Tile elevL1 = new ElevL1(11);
	public static Tile elevL2 = new ElevL2(12);
	public static Tile elevL3 = new ElevL3(13);
	public static Tile elevL4 = new ElevL4(14);
	public static Tile elevL5 = new ElevL5(15);
	public static Tile elevL6 = new ElevL6(16);
	
	public static Tile elevR1 = new ElevR1(21);
	public static Tile elevR2 = new ElevR2(22);
	public static Tile elevR3 = new ElevR3(23);
	public static Tile elevR4 = new ElevR4(24);
	public static Tile elevR5 = new ElevR5(25);
	public static Tile elevR6 = new ElevR6(26);
	
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
