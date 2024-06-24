import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne;
		int numTwo;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter your first number");
		numOne= scn.nextInt();
		System.out.println("enter your second number");
		numTwo = scn.nextInt();
		
		sum10(numOne, numTwo);


	}
	public static boolean sum10(int numOne, int numTwo) {
		if (numOne + numTwo == 10) {
			System.out.println("the sum is 10");
			return true;
		} else {
			System.out.println("the sum is not 10");
			return false;
		}
		
	}

}
