
public class Time {

	private int hour;
	private int minute;
	private double second;
	private String AmPm;
	

	public Time() {
		//new Time();
		this.hour = 00;
		this.minute = 00;
		this.second = 00.0;
		this.AmPm = null;
	}

	public Time(int hour, int minute, double second, String AmPm) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.AmPm = AmPm;
	
	}
	
	public String getAmPm() {
		return AmPm;
	}

	public void setAmPm(String amPm) {
		AmPm = amPm;
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

	public void print(boolean military) {
		if(military == false) {
			if (hour > 12) {
				System.out.println((hour - 12) + ":" + minute + ":" + second + "PM");
			}else {
			System.out.println(hour + ":" + minute + ":" + second + "AM");
			}
		}else {
		System.out.println(hour + ":" + minute + ":" + second);
		}
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
