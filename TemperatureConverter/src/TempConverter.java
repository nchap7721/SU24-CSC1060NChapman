import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double faren; 
		double cel;
		double kel;
		System.out.println("Give me a temperaure in farenheit and I'll give it to you in Celsius and Kelvin");
		Scanner scn = new Scanner(System.in);
		faren = scn.nextInt();
		cel = ((faren - 32)*5)/9;
		kel = cel + 273.15;
		System.out.println("you gave me " + faren + " degrees is Farenheit\nyour temperature in Celsius is " + 
		cel + " degrees\nyour temperature in Kelvin is " + kel + " degrees");
	}
	

}
