package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int MARIO_WIDTH = 20,MARIO_HEIGTH = 35;
	public static BufferedImage player;
	public static void init() {
		SpriteSheet mario = new SpriteSheet(ImageLoader.loadImg("/sprites/mario_sheet.png"));
		player = mario.crop(1, 310, MARIO_WIDTH, MARIO_HEIGTH);
	}
	
}
