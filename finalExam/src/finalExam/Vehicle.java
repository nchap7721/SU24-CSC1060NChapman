package finalExam;

public class Vehicle {
	private String Make;
	private String Model;
	private int year;
	
	
	public Vehicle() {
		
	}
	
	public Vehicle(String make, String model, int year) {
		super();
		this.Make = make;
		this.Model = model;
		this.year = year;
	}


	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	@Override
	 public String toString() {
		return "Vehicle Make = " + Make + "\nModel = " + Model + "\nyear = " + year;
	}
	
	
}
