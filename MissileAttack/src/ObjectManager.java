
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;


public class ObjectManager {
	ArrayList<GameObject> objects;

	long enemyTimer = 0;
	int enemySpawnTime = 100;
	long terrainTimer = 0;
	int terrainSpawnTime = 1000;

	public ObjectManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		spawnTerrain();
		manageEnemies();
		checkCollision();

		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}

		purgeObjects();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}

	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive()) {
				objects.remove(i);
			}
		}
	}

	private void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addObject(new EnemyObject(new Random().nextInt(Runner.WIDTH), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();
		}
	}

	private void spawnTerrain() {
		if (System.currentTimeMillis() - terrainTimer >= terrainSpawnTime) {
			Random r = new Random();
			// int width = r.nextInt(5) + 1;
			// int height = 25;
			//
			int y = Runner.HEIGHT - 200;
			// y = y - (57 * (r.nextInt(3) + 1));
			// for (int i = 1; i < width; i++) {
			int x = Runner.WIDTH + 57;

			addObject(new Terrain(x, y, 57, 57));

			terrainTimer = System.currentTimeMillis();
		}

	}

	private void checkCollision() {
		for (int i = 0; i < objects.size(); i++) {
			for (int j = i + 1; j < objects.size(); j++) {
				GameObject o1 = objects.get(i);
				GameObject o2 = objects.get(j);

				if (o1.getColBox().intersects(o2.getColBox())) {
					o1.setColliding(true);
					o1.setCollisionObject(o2);
					o2.setColliding(true);
					o2.setCollisionObject(o1);
				}
			}
		}
	}

	public void reset() {
		objects.clear();
	}
}
