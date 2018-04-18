package unit11LabAssesment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Essay {
	ArrayList<Paragraph> essay;
	String name;
	int period;
	public Essay(){
		essay = new ArrayList<Paragraph>();
		name = "";
		period = 0;
	}
	public Essay(ArrayList<Paragraph> s){
		essay = new ArrayList<Paragraph>();
		essay = s;
	}public Essay(ArrayList<Paragraph> s, String name, int period){
		essay = new ArrayList<Paragraph>();
		essay = s;
		this.name = name;
		this.period = period;
	}
	public void setName(String name1){
		name = name1;
	}
	public void setPeriod(int period1){
		period = period1;
	}
	public void setSentence(ArrayList<Paragraph> s){
		essay = s;
	}
	public ArrayList<Paragraph> getSentence(){
		return essay;
	}
	public void addParagraph(Paragraph p){
		essay.add(p);
	}
	public void removeParagraph(int index){
		essay.remove(index);
	}
	public void removeParagraph(Paragraph p){
		while(essay.contains(p)){
			essay.remove(p);
		}
	}
	public String setHeader(String name, int period){
		String output = "";
		output += name + "\n";
		output += getCurrentTimeStamp() + "\n";
		output += "Period " + period + "\n\n";
		return output;
	}
	public String getCurrentTimeStamp() {
	    return new SimpleDateFormat("MM.dd.YYYY").format(new Date());
	}
	public String toString(){
		String output = "";
		output += setHeader(name, period);
		for(Paragraph p: essay){
			output += p.toString() + "\n     ";
		}
		output = output.substring(0, output.length()-1);
		output += "\n Thank you for reading my essay! - " + name;
		return output;
	}
}
