package bullet;


import javafx.scene.image.Image;
import main.MainApplication;
import util.Coord;

public class FireBullet extends Bullet {
	
	protected int lifeTime;
	private static final double FIRE_RADIUS = 17;
	protected static final Image FIRE_BULLET = new Image("file:res/bullets/flamethrower_bullet.png");
	
	public FireBullet(double speed, int damage, int lifeTime) {
		super("flamethrower_bullet", speed, damage);
		this.lifeTime = lifeTime;
	}
	
	public FireBullet(FireBullet bullet, Coord velocity) {
		super(new Coord(MainApplication.SCREEN_WIDTH / 2, MainApplication.SCREEN_HEIGHT / 2), velocity, FIRE_RADIUS);
		this.lifeTime = bullet.lifeTime;
		this.bulletImage = bullet.bulletImage;
		this.speed = bullet.speed;
		this.damage = bullet.damage;
	}
	
	public boolean isDisappear() {
		return lifeTime < 0;
	}
	
	@Override
	public void update() {
		updatePosition();
		lifeTime--;
	}
	
}
