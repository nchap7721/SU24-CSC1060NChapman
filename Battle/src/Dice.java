import java.util.Random;

public class Dice {
	private int sides;
	private int rolls;
	private Random rand = new Random();

	public Dice(int sides, int rolls) {
		super();
		if (sides < 2) {
			this.sides = 2;
		} else {
			this.sides = sides;
		}
		this.rolls = rolls;
	}

	public int roolDice() {
		int sum = 0;
		for (int i = 0; i < rolls; i++) {
			sum += rand.nextInt(this.sides) +1;
		}
		return sum;
	}
}
