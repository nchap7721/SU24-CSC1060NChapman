
public class Time {

	private int hour;
	private int minute;
	private int second;
	private String amPm;

	public Time() {
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
		this.amPm = null;
	}

	public Time(int hour, int minute, int second, String amPm) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.amPm = amPm;

	}

	public String getAmPm() {
		return amPm;
	}

	public void setAmPm(String amPm) {
		this.amPm = amPm;
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

	public void setSecond(int second) {
		this.second = second;
	}

	public int adj() {
		if (second > 59) {
			int sMax = second / 60;
			second = second - (sMax * 60);
			minute = minute + sMax;
		}
		if (minute > 59) {
			int mMax = minute / 60;
			minute = minute - (mMax * 60);
			hour = hour + mMax;
		}
		if (hour > 12) {
			int hMax = hour / 12;
			hour = hour - (hMax * 12);
			if (hMax % 2 == 1) {
				amPm = "Pm";
			}
		}
		int newH = hour; 
		int newM = minute;
		int newS = second;
		return newH, newM, newS;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second + "" + amPm;
	}

}
