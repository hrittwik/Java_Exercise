import java.util.Scanner;


public class Prob9 {
	public static void main(String[] args){
		 
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("Distance in KM: " + i);
		
		float toMeter = i * 1000;
		System.out.println("Distance in Meter: " + toMeter);
		
		double toFeet = i * 3280.84;
		System.out.println("Distance in Meter: " + toFeet);
		
		double toInch = i * 39370.1;
		System.out.println("Distance in Meter: " + toInch);
		
		double toCentimeter = i * 100000;
		System.out.println("Distance in Meter: " + toCentimeter);
		
	}
}

