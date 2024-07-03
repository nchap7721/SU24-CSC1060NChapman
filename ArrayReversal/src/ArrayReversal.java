
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] numbers = new int[100];
		int count = 0;

		System.out.println("Enter positive numbers and when you're done enter -1");
		boolean check = true;
		while (check == true) {
			int num = scn.nextInt();
			if (num == -1 || count >= 100) {
				check = false;
				break;
			}
			numbers[count] = num;
			count++;
		}

		System.out.println("Your numbers in reverse order:");
		for (int i = count - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

	}
}