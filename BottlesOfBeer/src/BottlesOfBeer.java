import java.util.Scanner;

public class BottlesOfBeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("how many bottles do you want");
		Scanner scn = new Scanner(System.in);
		int bottles = scn.nextInt();
		int goToStore = bottles;
		while (bottles >= 1) {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles
					+ " bottles of beer.\ntake one down pass it around ");
			bottles = bottles - 1;
			System.out.println(bottles + " bottles of beer on the wall.\n");
			if (bottles == 2) {
				System.out.println(bottles + " bottles of beer on the wall," + bottles
						+ " bottles of beer.\ntake one down pass it around ");
				bottles = bottles - 1;
				System.out.println(bottles + " bottle of beer on the wall.\n");
			}
			if (bottles == 1) {
				System.out.println(bottles + " bottle of beer on the wall," + bottles
						+ " bottle of beer.\ntake one down pass it around ");
				bottles = bottles - 1;
				System.out.println(bottles + " bottles of beer on the wall.\n");
			}
			if (bottles == 0) {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " of beer ");
				System.out.println("go to the store and buy some more, " + goToStore + " bottles of beer on the wall");
			}
		}
	}

}
