package unit11LabAssesment;

import java.util.ArrayList;

public class Sentence {
	ArrayList<Word> sentence;
	public Sentence(){
		sentence = new ArrayList<Word>();
	}
	public Sentence(ArrayList<Word> s){
		sentence = new ArrayList<Word>();
		sentence = s;
	}
	public void setSentence(ArrayList<Word> s){
		sentence = s;
	}
	public ArrayList<Word> getSentence(){
		return sentence;
	}
	public void addWord(Word s){
		sentence.add(s);
	}
	public void removeWord(int index){
		sentence.remove(index);
	}
	public void removeWord(Word w){
		while(sentence.contains(w)){
			sentence.remove(w);
		}
	}
	public String toString(){
		String output = "";
		for(Word w: sentence){
			output += w.getWord() + " ";
		}
		output = output.substring(0, output.length()-1);
		output += ".";
		return output;
	}
}
