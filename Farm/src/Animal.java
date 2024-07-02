
public class Animal {
	private double height;
	private double weight;
	private String name;

	public Animal() {
		this.height = 0.0;
		this.weight = 0.0;
		this.name = null;
	}

	public Animal(double height, double weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//methods
	public String makeSound() {
		return("blah blah");
	}

	@Override
	public String toString() {
		return "Animal [ height = " + height + ", weight = " + weight + ", name = " + name + " ] ";
	}

}
