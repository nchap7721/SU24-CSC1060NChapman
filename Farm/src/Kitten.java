
public class Kitten extends Cat {
	private int cuteness;

	public Kitten(double height, double weight, String name, int cuteness, String color) {
		super(height, weight, name, color);
		this.cuteness = cuteness;
	
	}

	public int getCuteness() {
		return cuteness;
	}

	public void setCuteness(int cuteness) {
		this.cuteness = cuteness;
	}

	public String makeSound() {
		return ("mew mew");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Kitten [ cuteness = " + cuteness + " ] ";
	}

	
}
