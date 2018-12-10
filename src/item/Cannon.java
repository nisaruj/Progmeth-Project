package item;

import bullet.CannonBall;

public class Cannon extends SingleShotWeapon {
	
	private static final int DAMAGE = 50;
	private static final int BULLET_SPEED = 5;

	public Cannon() {
		super("cannon");
		this.bullet = new CannonBall(BULLET_SPEED, DAMAGE);
		this.fireRate = 30;
		this.reloadSize = 5;
		this.reloadCost = 10;
	}

	public Cannon(int x, int y, int ammo) {
		super("cannon", x, y, ammo);
		this.bullet = new CannonBall(BULLET_SPEED, DAMAGE);
		this.fireRate = 30;
		this.reloadSize = 5;
		this.reloadCost = 10;
	}

}
