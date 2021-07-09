package tile;

import graphics.Assets;

public class ElevB2 extends Tile{

	public ElevB2(int ID) {
		super(Assets.elevB2, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
