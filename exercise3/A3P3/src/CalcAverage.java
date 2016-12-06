import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean a = true;
		
		while(a == true){
			try{
				
				System.out.println("Enter a natural number: ");
				int N = Integer.parseInt(input.nextLine());
				double d = avgFirstN(N);
				
				
				if(d == 0 || Double.isNaN(d)){
					System.out.println("");
					
				}else{
					System.out.println("Average of first N natural numbers: "+ d);
					a = false;
				}
			
			} catch (InputMismatchException e) {
				System.out.println("Enter a valid input");
			} catch (NumberFormatException e){
				System.out.println("Enter a valid input");
			}
			
		}
	}
	
	public static double avgFirstN(int n){
		double sum = 0;
		
		try{
			if(n <= 0 ){
				throw new IllegalArgumentException();
			}else{
				for(int i = 0; i <= n; i++){
					sum += i ;
				}	
			}
		}catch (IllegalArgumentException e) {
			System.out.println("Enter a Natural number " + n + " is not a natural number");
		}
		return sum/n;
		
	}
}
