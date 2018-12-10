package item;

import bullet.RandomBullet;

public class Matter extends SingleShotWeapon {

	private static final int DAMAGE = 0; // Damage depends on bullet type
	private static final int BULLET_SPEED = 5;

	public Matter() {
		super("matter");
		this.bullet = new RandomBullet(BULLET_SPEED, DAMAGE);
		this.fireRate = 30;
		this.reloadSize = 10;
		this.reloadCost = 7;
	}

	public Matter(int x, int y, int ammo) {
		super("matter", x, y, ammo);
		this.bullet = new RandomBullet(BULLET_SPEED, DAMAGE);
		this.fireRate = 30;
		this.reloadSize = 10;
		this.reloadCost = 7;
	}

}
