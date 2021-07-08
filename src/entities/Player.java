package entities;

import java.awt.Graphics;

import graphics.Assets;
import main.Game;

public class Player extends Entity {

	private Game game;
	private float speed = 3.0f;
	private static final int PLAYER_WIDTH = 40, PLAYER_HEIGHT = 70;
	private static final float DEFALT_POSY = 450;
	

	public Player(Game game, float posX, float posY) {
		super(posX, posY, PLAYER_WIDTH, PLAYER_HEIGHT);
		this.game = game;
	}

	@Override
	public void update() {
		getInput();
	}
	
	private void getInput() {
		if(game.getKeyManager().right) {
			posX += speed;
		}
		if(game.getKeyManager().left) {
			posX -= speed;
		}
		if(game.getKeyManager().jump) {
			posY -= speed;
		}
		else {
			if(posY < DEFALT_POSY)
			posY += speed;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)posX, (int)posY, width, heigth, null);
	}
}
