package entities;

import java.awt.Graphics;

import graphics.Assets;
import main.Game;

public class Player extends Entity {

	private Game game;
	private float speed = 3.0f;
	private static final int PLAYER_WIDTH = 40, PLAYER_HEIGHT = 70;
	private static final float DEFALT_POSY = 445;
	

	public Player(Game game, float posX, float posY) {
		super(posX, posY, PLAYER_WIDTH, PLAYER_HEIGHT,3);
		this.game = game;
	}

	@Override
	public void update() {
		getInput();
	}
	
	private void getInput() {
		if(game.getKeyManager().right) {
			if(posX < 850) {
				posX += speed;
			}
		}
		if(game.getKeyManager().left) {
			if(posX > 60) {
				posX -= speed;
			}
			
		}
		if(game.getKeyManager().jump) {
			if(posY > 325) {
				posY -= speed;
			}
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
