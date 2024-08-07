
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(3, 45, 35.0, "Am");
		printWith(t1);
		Time t2 = new Time(17, 30, 30.0, "Pm");
		printWith(t2);
		adding(t1, t2);
		formatting(t1);
		printWith(t1);
		change(t1);
		printWith(t1);
	}
	
	public static void printWith(Time t1) {
		System.out.println(t1.getHour() + ":" + t1.getMinute() 
		+ ":" + t1.getSecond() + " " + t1.getAmPm());
		
	}

	public boolean equals(Time t1, Time t2) {
		final double D = 0.001;
		return t1.getHour() == t2.getHour()
			&& t1.getMinute() == t2.getMinute()
			&& Math.abs(t1.getSecond() - t2.getSecond()) < D;
			
	}
	
	public static void adding(Time t1, Time t2) {
		t1.setSecond(t1.getSecond() + t2.getSecond());
		t1.setMinute(t1.getMinute() + t2.getMinute());
		t1.setHour(t1.getHour() + t2.getHour());
	}
	
	public static void formatting(Time t1) {
		if(t1.getSecond() > 60) {
			t1.setMinute(t1.getMinute() + 1);
			t1.setSecond(t1.getSecond() - 60);
		}
		if(t1.getMinute() > 60) {
			t1.setHour(t1.getHour() + 1);
			t1.setMinute(t1.getMinute() - 60);
		}
		if(t1.getHour() > 24) {
			int max = t1.getHour() / 24;
			t1.setHour(t1.getHour() - (24 * max));
		}
	}
	
	public static void change(Time t1) {
		if(t1.getHour() > 12) {
			int halfDay = t1.getHour() / 12;
			if(halfDay % 2 == 1) {
				t1.setAmPm("Am");
			}
			if(halfDay % 2 == 0) {
				t1.setAmPm("Pm");
			}
		}
	}
	
}
