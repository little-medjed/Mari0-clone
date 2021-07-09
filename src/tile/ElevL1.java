package tile;

import graphics.Assets;

public class ElevL1 extends Tile{

	public ElevL1(int ID) {
		super(Assets.elevL1, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
