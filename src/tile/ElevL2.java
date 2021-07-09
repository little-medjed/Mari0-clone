package tile;

import graphics.Assets;

public class ElevL2 extends Tile{

	public ElevL2(int ID) {
		super(Assets.elevL2, ID);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
