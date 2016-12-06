import java.util.Scanner;

public class NumberMain {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean a = true;
		try{
			
			
			
				System.out.println("Enter the first Number: " );
				int firstNumber = Integer.parseInt(input.nextLine()); 
				
				System.out.println("Enter the Second Number: " );
				int secondNumber = Integer.parseInt(input.nextLine());
				
				Number n = new Number(firstNumber, secondNumber);
				
				System.out.println("Enter A for addition, S for subtraction, M for multiplication, D for division:");
				char c = input.next().trim().charAt(0); 
				
				if(c == 'A' || c == 'a'){
					n.add();
				}else if (c == 'S' || c == 's') {
					n.sub();
				}else if(c == 'm' || c == 'M'){
					n.mul();
				}else if(c == 'D' || c == 'd'){
					n.div();
				}else{
					System.out.println("Invalid Operation, Please try again.");
				}
		
		}catch(NumberFormatException e){
			System.out.println("Please Enter a valid Input");
		}
			
		
	}
}
