import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CDR {
	public static void main(String[] args) throws IOException{
		String A_number;
		String B_number;
		String duration;
		String calculateCharge;
		String userInput;
		
		Scanner input = new Scanner(System.in);
		boolean a = true;
		while(a == true){
			try{
				BufferedWriter out= new BufferedWriter(new FileWriter("calculatedCharge.txt", true));
				
				System.out.println("Enter first number:");
				A_number = Integer.toString(Integer.parseInt(input.nextLine()));
				System.out.println("Enter Second number:");
				B_number = Integer.toString(Integer.parseInt(input.nextLine()));
				System.out.println("Enter call duration:");
				duration = Integer.toString(Integer.parseInt(input.nextLine()));
				calculateCharge = Integer.toString(calculateCharge(duration));
				System.out.println("Calculate Charge is: " + calculateCharge);
				
				userInput = A_number + " " + B_number + " " + duration + " " + calculateCharge; 
				out.write(userInput);//Write out a string to the file
	            out.newLine();
	            //out.write(nastyHack); //write a new line to the file on the next line
	            out.close();//flushes and closes the stream
	        	a = false;
				
			}catch(InputMismatchException e){
				System.out.println("Error: " + e);
			}catch(NumberFormatException e){
				System.out.println("Error: " + e);
			}
			
		}
		
		 try {
             InputStream input1 = new BufferedInputStream(new FileInputStream("calculatedCharge.txt"));
             byte[] buffer = new byte[8192];
             for (int length = 0; (length = input1.read(buffer)) != -1;) {
                 System.out.write(buffer, 0, length);
             }
                 input.close();
         }catch(IOException e){
             System.out.println("There was a problem: " + e);
         }
	}
	
	public static int calculateCharge(String duration){
		int d = Integer.parseInt(duration);
		return d*1; 
	}
	
	
}
