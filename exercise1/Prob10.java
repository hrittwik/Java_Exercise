import java.util.Scanner;


public class Prob10{
	public static void main(String[] args){
		 
		Scanner scan = new Scanner(System.in);
		
		String i = scan.next();
		System.out.println("The input number: " + i);
		
		char[] charArray = i.toCharArray(); 
		
		int firstDigit = Character.getNumericValue(charArray[0]);
		int lastDigit = Character.getNumericValue(charArray[3]);
		
		int sum = firstDigit + lastDigit;
		
		System.out.println("Sum of first and last digit number: " + sum);
	}
	
}
