package finalExam;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] myRides = new Vehicle[3];
		myRides[0] = new Car("Toyota", "Camry", 2020, 4);
		myRides[1] = new Car("Honda", "Accord", 2021, 2);
		myRides[2] = new Vehicle("Ford", "F-150", 2022);
		
		for(int i = 0; i < myRides.length; i++) {
			System.out.println(myRides[i]);
		}
		
		Scanner scn = new Scanner(System.in);
		//System.out.println("what car");
		int i = scn.nextInt();
		Vehicle myPick = myRides[i]; // Specific Car ha hey chose 
		
		
		myPick.toString();
		
		for(Vehicle myType : myRides ) {
			printOut(myType); 
		}
		
	}
	
	static void printOut(Vehicle myRides) {
		myRides.toString();
	}

}
