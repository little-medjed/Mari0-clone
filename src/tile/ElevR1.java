package tile;

import graphics.Assets;

public class ElevR1 extends Tile{

	public ElevR1(int ID) {
		super(Assets.elevR1, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
