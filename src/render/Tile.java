package render;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import main.MainApplication;
import util.Coord;

public class Tile implements Renderable {

	public static final Image TILESET = new Image(ClassLoader.getSystemResource("tileset.png").toString());
	public static final int TILE_SIZE = 12;
	public static final Coord GRASS_TILE_POS1 = new Coord(0, 0);
	public static final Coord GRASS_TILE_POS2 = new Coord(12, 0);
	public static final Coord DIRT_TILE_POS = new Coord(0, 12);

	private int type;

	public Tile(int type) {
		// type 0: grass, type 1: another grass, type 2: dirt
		this.type = type;
	}
	
	@Override
	public void render(GraphicsContext gc, int x, int y) throws Exception {
		if (x < -TILE_SIZE || y < -TILE_SIZE || x > MainApplication.SCREEN_WIDTH || y > MainApplication.SCREEN_HEIGHT) {
			throw new Exception("Render out of screen");
		}
		if (type == 0) {
			gc.drawImage(TILESET, GRASS_TILE_POS1.getX(), GRASS_TILE_POS1.getY(), TILE_SIZE, TILE_SIZE, x, y, TILE_SIZE,
					TILE_SIZE);
		} else if (type == 1) {
			gc.drawImage(TILESET, GRASS_TILE_POS2.getX(), GRASS_TILE_POS2.getY(), TILE_SIZE, TILE_SIZE, x, y, TILE_SIZE,
					TILE_SIZE);
		} else {
			gc.drawImage(TILESET, DIRT_TILE_POS.getX(), DIRT_TILE_POS.getY(), TILE_SIZE, TILE_SIZE, x, y, TILE_SIZE,
					TILE_SIZE);
		}
	}

	public int getType() {
		return type;
	}
}
