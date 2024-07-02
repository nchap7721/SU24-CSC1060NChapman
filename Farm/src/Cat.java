
public class Cat extends Animal {
	private String color;

	public Cat(double height, double weight, String name, String color) {
		super(height, weight, name);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// methods
	public String makeSound() {
		return ("meow meow");
	}

	@Override
	public String toString() {
		return super.toString() + "Cat [ Color = " + color + " ] ";
	}

}
