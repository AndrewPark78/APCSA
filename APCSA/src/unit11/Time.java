package unit11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	static int hour;
	static int minute;
	static int second;

	public static void main(String[] args) {
		Time t = new Time();
		System.out.println(hour + "" + minute + "" + second);
	}

	public Time() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String s = dateFormat.format(date);
		System.out.println(s.length());
		hour = Integer.parseInt(s.substring(0, 2));
		minute = Integer.parseInt(s.substring(3, 5));
		second = Integer.parseInt(s.substring(6));
	}

	public Time(Time t) {
		long a = System.currentTimeMillis();
	}
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public void setTime(long elapsedTime){
		hour = 0;
		minute = 0;
		second = 0;
		while(elapsedTime>3600000){
			hour += 1;
			elapsedTime -= 3600000;
		}
		while(elapsedTime>60000){
			minute += 1;
			elapsedTime -= 60000;
		}
		while(elapsedTime>1000){
			second += 1;
			elapsedTime -= 1000;
		}
	}
	
}
