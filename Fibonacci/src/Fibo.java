import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("which fibonacci number would you like to go to?");
		int fibNum = scn.nextInt();
		System.out.println("while loop");
		whilefib(fibNum);
		System.out.println("for loop");
		forFib(fibNum);
	}
	
	public static void whilefib(int fibNum) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		int i = 0;
		
		System.out.println("0\n1\n");
		
		while(i < fibNum) {
			sum = num1 + num2;
			num2 = num1;
			num1 = sum;
			System.out.println(num1);
			i++;
		}
		
	}

	public static void forFib(int fibNum) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		
		System.out.println("0\n1\n");
		
		for(sum = 0; sum < fibNum +1; sum++) {
			sum = num1 + num2;
			num2 = num1;
			num1 = sum;
			System.out.println(num1);
		}
	}
}
