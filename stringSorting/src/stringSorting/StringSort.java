package stringSorting;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("how many strings you're going to use ");
		int numStrings = scanner.nextInt();
		String[] strings = new String[numStrings];

		System.out.println("give me your strings ");
		for (int i = 0; i < numStrings; i++) {
			strings[i] = scanner.next();
		}

		bubbleSort(strings, true);
		System.out.println("\nin alphabetic order");
		printArray(strings);

		bubbleSort(strings, false);
		System.out.println("\nin reverse alphabetic order");
		printArray(strings);

	}

	public static void bubbleSort(String[] arr, boolean ascending) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (ascending ? (arr[j].compareTo(arr[j + 1]) > 0) : (arr[j].compareTo(arr[j + 1]) < 0)) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
