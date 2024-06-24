import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int drinkCode;
		Scanner scn = new Scanner(System.in);
		System.out.println("give me a number 1-3 and i'll give you a drink");
		drinkCode = scn.nextInt();
		if (drinkCode == 1) {
			System.out.println("you got water");
		} else {
			if (drinkCode == 2) {
				System.out.println("you got coke");
			} else {
				if (drinkCode == 3) {
					System.out.println("you got coffee");
				}
			}
		}
	}

}
