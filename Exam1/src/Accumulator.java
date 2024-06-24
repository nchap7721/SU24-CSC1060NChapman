
import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		notZero();
	}
		
		public static void notZero(){
			int num;
			int sum = 0;
			System.out.println("give  me some numbers and i'll give you the sum after you enter zero");
			Scanner scn = new Scanner(System.in);
			num = scn.nextInt();
			while(num != 0 ) {
				sum = num + sum;
				System.out.println("give me another number");
				num = scn.nextInt();
			}
			System.out.println("your sum is " + sum);
			
		}
	}


