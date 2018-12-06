package bullet;

import java.util.ArrayList;

import character.Enemy;
import javafx.scene.image.Image;
import main.MainApplication;
import util.Coord;

public class Rocket extends Bullet {
	
	private static final double FIRE_RADIUS = 1;
	private static final double MASS = 0.1;
	private static final Image ROCKET = new Image("file:res/bullets/rocket.png");
	private static final double BLAST_RANGE = 100;
	
	public Rocket(double speed, int damage) {
		super("rocket", speed, damage, MASS);
	}
	
	public Rocket(Rocket bullet, Coord velocity) {
		super(new Coord(MainApplication.SCREEN_WIDTH / 2, MainApplication.SCREEN_HEIGHT / 2), velocity, FIRE_RADIUS);
		this.bulletImage = ROCKET;
		this.damage = bullet.damage;
		this.speed = bullet.speed;
		this.mass = bullet.mass;
	}
	
	public void explode(ArrayList<Enemy> enemies) {
		for (Enemy e : enemies) {
			if (isInRange(e)) {
				e.takeDamage(damage);
			}
		}
	}
	
	private boolean isInRange(Enemy e) {
		return Coord.distance(this.absolutePosition, e.getPosition()) < BLAST_RANGE;
	}

}
