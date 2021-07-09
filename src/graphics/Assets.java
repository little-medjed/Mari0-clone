package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int MARIO_WIDTH = 20,MARIO_HEIGHT = 35;
	private static final int TILE_WIDTH = 16,TILE_HEIGHT = 16;
	private static final int ELEV_TOP_WIDTH = 13;
	public static BufferedImage player,background, plate_down, plate_up, floor,empty,
	elevL1,elevL2,elevL3,elevL4,elevL5,elevL6,elevB1,elevB2,
	elevR1,elevR2,elevR3,elevR4,elevR5,elevR6,
	door,meGrill,button1,button2,box;
	
	public static void init() {
		SpriteSheet mario = new SpriteSheet(ImageLoader.loadImg("/sprites/mario_sheet.png"));
		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImg("/sprites/tiles.png"));
		SpriteSheet itens = new SpriteSheet(ImageLoader.loadImg("/sprites/itens.png"));
		
		background = ImageLoader.loadImg("/sprites/background.png");
		player = mario.crop(1, 310, MARIO_WIDTH, MARIO_HEIGHT);
		plate_down = tiles.crop(0, 17, TILE_WIDTH, TILE_HEIGHT);
		plate_up = tiles.crop(0, 0, TILE_WIDTH, TILE_HEIGHT);
		floor = tiles.crop(17, 0, TILE_WIDTH, TILE_HEIGHT);
		empty = tiles.crop(170, 17, TILE_WIDTH, TILE_HEIGHT);
		
		elevL1 = tiles.crop(326, 0, ELEV_TOP_WIDTH, TILE_HEIGHT);
		elevL2 = tiles.crop(340, 0, ELEV_TOP_WIDTH, TILE_HEIGHT);
		elevL3 = tiles.crop(323, 17, TILE_WIDTH, TILE_HEIGHT);
		elevL4 = tiles.crop(340, 17, TILE_WIDTH, TILE_HEIGHT);
		elevL5 = tiles.crop(323, 34, TILE_WIDTH, TILE_HEIGHT);
		elevL6 = tiles.crop(340, 34, TILE_WIDTH, TILE_HEIGHT);
		
		elevB1 = tiles.crop(323, 51, TILE_WIDTH, TILE_HEIGHT);
		elevB2 = tiles.crop(340, 51, TILE_WIDTH, TILE_HEIGHT);
		
		elevR1 = tiles.crop(190, 0, ELEV_TOP_WIDTH, TILE_HEIGHT);
		elevR2 = tiles.crop(204, 0, ELEV_TOP_WIDTH, TILE_HEIGHT);
		elevR3 = tiles.crop(187, 17, TILE_WIDTH, TILE_HEIGHT);
		elevR4 = tiles.crop(204, 17, TILE_WIDTH, TILE_HEIGHT);
		elevR5 = tiles.crop(187, 34, TILE_WIDTH, TILE_HEIGHT);
		elevR6 = tiles.crop(204, 34, TILE_WIDTH, TILE_HEIGHT);
		
		door = itens.crop(123, 54, 8, 14);
		meGrill = itens.crop(174, 1, 1, 32);
		button1 = itens.crop(90, 48, 32, 3);
		button2 = itens.crop(96, 45, 20, 2);
		box = itens.crop(1, 1, 12, 12);
	}
	
}
