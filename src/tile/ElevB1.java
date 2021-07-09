package tile;

import graphics.Assets;

public class ElevB1 extends Tile{

	public ElevB1(int ID) {
		super(Assets.elevB1, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
