
public class Dog extends Animal{
	private String breed;
	
	public Dog (double height, double weight, String name, String breed) {
		super(height, weight, name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String makeSound() {
		return ("arf arf");
	}

	@Override
	public String toString() {
		return super.toString() + "Dog [ breed = " + breed + " ] ";
	}
	
	
}
