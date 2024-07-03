
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		System.out.println(t1);
		Time t2 = new Time(11, 59, 59.9);
		System.out.println(t2);
		Time sum = new Time();
		
		System.out.println(t1.equals(t2));
	}
	
	public static void printTime(Time t1) {
		System.out.printf("%02d:%02d:%04.1f\n" , 
				t1.getHour(), t1.getMinute(), t1.getSecond());
	}

	public boolean equals(Time t1, Time t2) {
		final double D = 0.001;
		return t1.getHour() == t2.getHour()
			&& t1.getMinute() == t2.getMinute()
			&& Math.abs(t1.getSecond() - t2.getSecond()) < D;
			
	}
	
	public static Time add(t2) {
		Time sum = new Time();
		sum.hour = this.getHour() + t2.getHour();
		sum.minute = this.getMinute() + t2.getMinute();
		sum.second = this.getSecond() + t2.getSecond();
		return sum;
	}
	
	public Time add(Time t1) {
		
	}
	
}
