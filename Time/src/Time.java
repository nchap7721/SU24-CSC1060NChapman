
public class Time {

	private int hour;
	private int minute;
	private double second;
	

	public Time() {
		this.hour = 00;
		this.minute = 00;
		this.second = 00.0;
	}

	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	
	}
	
	public void sHour(int hour) {
		this.hour = hour;
	}
	
	public void sMinute(int minute) {
		this.minute = minute;
	}
	
	public void sSecond(double second) {
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}


	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
