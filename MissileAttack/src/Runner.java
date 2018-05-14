public class Runner {
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 700;
	
	public static void main(String[] args) {
		new Runner().start();
	}
	
	public void start(){
		new GameWindow(WIDTH, HEIGHT, "Quest");
	}
}
