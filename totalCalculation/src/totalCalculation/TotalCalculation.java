package totalCalculation;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class TotalCalculation {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		String dbFile = "items.txt";
		
		double subTotal = 0;
		double taxRate = 0.053;
		double grandTotal = 0;
		double taxAmt = 0;
		
		try {
			Scanner read = new Scanner(new File(dbFile));
			System.out.println("File Found");
			
			while(read.hasNextDouble()) {
				subTotal += read.nextDouble();
			}
			
			taxAmt = subTotal * taxRate;
			grandTotal = subTotal + taxAmt;
			
			System.out.println("subtotal: " + subTotal);
			System.out.printf("Tax:%.2f\n", taxAmt);
			System.out.printf("total:%.2f\n", grandTotal);
		}
		catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("opps, no file called " + dbFile);
		}
		String outFile = "C:\\Users\\18123\\SU24-CSC1060NChapman\\total.txt";
		
		try {
			FileWriter write = new FileWriter(outFile);
			
			String line1 = String.format("subtotal:%.2f\n ",  subTotal);
			String line2 = String.format("Tax:%.2f\n", taxAmt);
			String line3 = String.format("total:%.2f\n", grandTotal);
			
			write.write(line1);
			write.write(line2);
			write.write(line3);
			System.out.println("your file was made correctly");
			write.close();
			
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("oh no, you couldn't create a file there");
		}
	}

}
