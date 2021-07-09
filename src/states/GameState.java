package states;

import java.awt.Graphics;

import entities.Player;
import levels.Level;
import main.Game;

public class GameState extends State {

	private Player p1;
	private Level test;
	
	public GameState(Game game) {
		super(game);
		p1 = new Player(game, 70, 445);
		test = new Level("assets/levels/test_level.txt");
	}
	
	@Override
	public void update() {
		test.update();
		p1.update();
	}

	@Override
	public void render(Graphics g) {
		test.render(g);
		p1.render(g);
	}
	
}
