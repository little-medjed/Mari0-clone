package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int MARIO_WIDTH = 20,MARIO_HEIGHT = 35;
	private static final int TILE_WIDTH = 16,TILE_HEIGHT = 16;
	public static BufferedImage player,background, plate_down, plate_up, floor,empty;
	
	public static void init() {
		SpriteSheet mario = new SpriteSheet(ImageLoader.loadImg("/sprites/mario_sheet.png"));
		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImg("/sprites/tiles.png"));
		
		background = ImageLoader.loadImg("/sprites/background.png");
		player = mario.crop(1, 310, MARIO_WIDTH, MARIO_HEIGHT);
		plate_down = tiles.crop(0, 17, TILE_WIDTH, TILE_HEIGHT);
		plate_up = tiles.crop(0, 0, TILE_WIDTH, TILE_HEIGHT);
		floor = tiles.crop(17, 0, TILE_WIDTH, TILE_HEIGHT);
		empty = tiles.crop(170, 17, TILE_WIDTH, TILE_HEIGHT);
	}
	
}
