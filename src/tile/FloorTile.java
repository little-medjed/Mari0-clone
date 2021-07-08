package tile;

import graphics.Assets;

public class FloorTile extends Tile {

	public FloorTile(int id) {
		super(Assets.floor, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
