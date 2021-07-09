package levels;

import java.awt.Graphics;

import tile.Tile;
import utils.Utils;

public class Level {

	@SuppressWarnings("unused")
	private int spawnX, spawnY;
	private int width, height;
	private int[][] level_tile;
	
	public Level(String path) {
		loadLevel(path);
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g) {
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile(x, y).render(g, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		Tile t = Tile.tiles[level_tile[x][y]];
		if(t == null) {
			return Tile.empty;
		}
		return t;
	}
	
	public void loadLevel(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		level_tile = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				level_tile[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
}
