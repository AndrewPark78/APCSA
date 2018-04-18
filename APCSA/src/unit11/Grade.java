package unit11;

public class Grade {
	private double value;

	public Grade() {

	}
	public Grade(double value){
		this.value = value;
	}
	public String getLetterGrade(){
		if(value > 89.5){
			return "A";
		}else if(value > 79.5){
			return "B";
		}else if(value > 69.5){
			return "C";
		}else if(value > 59.5){
			return "D";
		}else{
			return "F";
		}
	}
	public double getNumericGrade(){
		return value;
	}
	public void setValue(double v){
		value = v;
	}
	public String toString(){
		return value + "\n" +getLetterGrade();
	}
}
