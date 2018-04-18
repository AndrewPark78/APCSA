package unit11LabAssesment;

public class Word {
	String word;
	public Word(){
		
	}
	public Word(String s){
		this.word = s;
	}
	public String getWord(){
		return word;
	}
	public void setWord(String s){
		word = s;
	}
	public String toString(){
		String output = word;
		return output;
	}
}
