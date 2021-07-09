package tile;

import graphics.Assets;

public class ElevR2 extends Tile{

	public ElevR2(int ID) {
		super(Assets.elevR2, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
