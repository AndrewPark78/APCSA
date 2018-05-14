package starshipLab;

public class Aliens {
	Alien[][] horde = new Alien[3][3];

	public static void main(String[] args) {
		Aliens Al = new Aliens();
		Al.spawnAlien();
	}
	public Alien[][] getHorde(){
		return horde;
	}
	public void spawnAlien() {
		int count = 0;
		for (int row = 0; row < horde.length; row++) {
			for (int col = 0; col < horde[row].length; col++) {
				Alien a = horde[row][col];
				if (a == null) {
					count++;
				}
			}
		}
		for (int row = 0; row < horde.length; row++) {
			for (int col = 0; col < horde[row].length; col++) {
				Alien a = horde[row][col];
				if (a == null) {
					int x = (int) Math.floor(Math.random() * 100);
					if (x == 1) {
						if(count == 0){
							a = new Alien(100, 100, 3);
						}
						else if (count <= 3) {
							a = new Alien(100, horde[row][col-1].getX()+(150*count));
						}else if(count <= 6){
							
						}
						else if(count <= 9){
							
						}
					}
				}
			}
		}
	}
}
