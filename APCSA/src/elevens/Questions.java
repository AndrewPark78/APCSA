package elevens;

public class Questions {
	public static void main(String[] args) {
		System.out.println(flip()
				);
	}
	public static String flip(){
		int i = (int) Math.floor(Math.random() * (3));
		if(i == 1){
			return "heads";
		}else{
			return "tails";
		}
	}
}
