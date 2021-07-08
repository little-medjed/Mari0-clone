package states;

import java.awt.Graphics;

import entities.Player;
import main.Game;

public class GameState extends State {

	private Player p1;
	
	public GameState(Game game) {
		super(game);
		p1 = new Player(game, 50, 450);
	}
	
	@Override
	public void update() {
		p1.update();
	}

	@Override
	public void render(Graphics g) {
		p1.render(g);
	}
	
}
