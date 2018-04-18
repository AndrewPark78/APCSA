package unit12;
import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		this.myHeight= ht;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		this.myHeight= ht;
		this.myWeight= wt;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		this.myHeight= ht;
		this.myWeight= wt;
		this.myAge= age;
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int num){
		myHeight = num;
	}
	public void setWeight(int num){
		myWeight = num;
	}
	public void setAge(int num){
		myAge = num;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHt(){
		return myHeight;
	}
	public int getWt(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   Monster m = this;
		return m;
	}

	public boolean equals( Object obj )
	{
		if(this == (Monster)obj){
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.getHt()>rhs.getHt()){
			return 1;
		}if(this.getWt()>rhs.getWt()){
			return 1;
		}if(this.getAge()>rhs.getAge()){
			return 1;
		}if(this.getHt()==rhs.getHt()&&this.getWt()==rhs.getWt()&&this.getAge()==rhs.getAge()){
			return 0;
		}

		return -1;
	}

	//write a toString() method
	public String toString(){
		String output = "";
		output += myHeight + ", " + myWeight + ", " + myAge;
		return output;
	}
	
}