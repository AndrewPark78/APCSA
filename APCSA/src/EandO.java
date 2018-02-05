import java.util.ArrayList;

public class EandO {
	public static void main(String[] args) {
		EandO x = new EandO();
		System.out.println(x.swtich("Hello World"));
	}
	public String swtich(String s){
		ArrayList<Character> before = new ArrayList<Character>();
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			before.add(s.charAt(i));
		}
		ArrayList<Character> after = new ArrayList<Character>();
		for(Character c: before){
			if(c == 'e'){
				after.add('o');
			}else if(c == 'o'){
				after.add('e');
			}else{
				after.add(c);
			}
		}
		for(Character m: after){
			output += m;
		}
		return output;
	}
}
