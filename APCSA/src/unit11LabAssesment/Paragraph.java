package unit11LabAssesment;

import java.util.ArrayList;

public class Paragraph {
	ArrayList<Sentence> paragraph;
	public Paragraph(){
		paragraph = new ArrayList<Sentence>();
	}
	public Paragraph(ArrayList<Sentence> s){
		paragraph = new ArrayList<Sentence>();
		paragraph = s;
	}
	public void setSentence(ArrayList<Sentence> s){
		paragraph = s;
	}
	public ArrayList<Sentence> getSentence(){
		return paragraph;
	}
	public void addSentence(Sentence s){
		paragraph.add(s);
	}
	public void removeSentence(int index){
		paragraph.remove(index);
	}
	public void removeSentence(Sentence w){
		while(paragraph.contains(w)){
			paragraph.remove(w);
		}
	}
	public String toString(){
		String output = "";
		for(Sentence w: paragraph){
			output += w.toString() + "\n ";
		}
		output = output.substring(0, output.length()-1);
		return output;
	}
}
