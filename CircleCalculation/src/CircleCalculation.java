import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numOne;
		String x = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("give me a radius and I'll give you the radius, circumference, area, and diameter");
		numOne = scn.nextDouble();
		String result = process(numOne, x);
		System.out.println(result);
	}

	public static String process(double numOne, String x) {
		double dia = (numOne * 2);
		double cir = (2 * Math.PI * numOne); // 2piR
		double area = (Math.PI * (numOne * numOne)); // piR^2
		x = ("your radius was " + numOne + "\nyour Circumference is " + cir + "\nyour area is " + area
				+ "\nyour Diameter is " + dia);
		return x;
	}

}
