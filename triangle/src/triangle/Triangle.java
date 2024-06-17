package triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean repeat = true;

		while (repeat == true) {
			int size;
			char specialChar;
			System.out.print("Enter size (1-50): ");
			// Get size of the triangle
			size = scn.nextInt();
			// Check if size is within range
			while (size < 1 || size > 50) {
				System.out.println("Size must be between 1-50!");
				System.out.print("Enter size (1-50): ");
				size = scn.nextInt();
			}

			// Get special character
			System.out.print("Enter your special character: ");
			specialChar = scn.next().charAt(0);

			// Print the triangle
			printTriangle(size, specialChar);

			// Ask if they want to repeat
			System.out.print("Would you like another triangle (Y/N)? ");
			char yOrN = scn.next().toUpperCase().charAt(0);
			repeat = yOrN == 'Y';
		}
		System.out.println("thanks, goodbye");
	}

	// Function to print triangle
	public static void printTriangle(int size, char specialChar) {
		// Loop for each row
		for (int i = 1; i <= size; i++) {
			// Print leading spaces
			System.out.printf("%" + (size - i + 1) * 2 + "s", "");

			// Print special chars
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.printf("%c ", specialChar);
			}
			System.out.println();
		}
	}

}
