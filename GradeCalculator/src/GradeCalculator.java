import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perc;
		Scanner scn = new Scanner(System.in);
		System.out.println("what percent did you get for your grade?");
		perc = scn.nextInt();
		if (perc >= 92) {
			System.out.println("you got an A!");
		} 
		else if (perc >= 89  && perc < 92) {
			System.out.println("you got an A-");
		} 
		else if (perc >= 87 && perc < 89) {
			System.out.println("you got a B+");
		} 
		else if (perc >= 82 && perc < 87) {
			System.out.println("you got a B");
		} 
		else if (perc >= 79 && perc < 82) {
			System.out.println("you got a B-");
		} 
		else if (perc >= 77 && perc < 79) {
			System.out.println("you got a C+");
		} 
		else if (perc >= 72 && perc < 77) {
			System.out.println("you got a C");
		} 
		else if (perc >= 69 && perc < 72) {
			System.out.println("you got a C-");
		} 
		else if (perc >= 67 && perc < 69) {
			System.out.println("you got a D+");
		} 
		else if (perc >= 60 && perc < 67) {
			System.out.println("you got a D");
		} 
		else if (perc >= 0 && perc < 60) {
			System.out.println("you got a D-");
		} 
		else if (perc < 0) {
			System.out.println("error, that cant happen.");
		}

	}

}
