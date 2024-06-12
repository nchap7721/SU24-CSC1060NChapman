import java.util.Scanner;

public class InteractiveGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scn.next();
		System.out.println(name);
		System.out.println("where are you from?");
		String place = scn.next();
		System.out.println(place);
		System.out.println("how old are you? (format numarically)");
		int age = scn.nextInt();
		System.out.println(age);
		System.out.println("Hello " + name + " from " + place + " you are " + age + " years old");
		System.out.println("what is your favorite activity?");
		String act = scn.next();
		System.out.println(act);
		System.out.println("have fun next time you " + act);
		System.out.println("how much would you like to donate today?");
		double donate = scn.nextDouble();
		System.out.println(donate);
		System.out.println("you will be donate " + donate + " today. Thank you!");
		
		

	}

}
