import java.util.Scanner;

public class Prob13 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your Still Hardness");
		int hardness = scan.nextInt();
		System.out.println("Enter your Still Carbon content");
		float carbonContent = scan.nextFloat();
		System.out.println("Enter your Still Tensile Strength");
		int tensileStrength = scan.nextInt();

		if(hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600){
			System.out.println("Your Still grade is 10" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}else if(hardness > 50 && carbonContent < 0.7 ){
			System.out.println("Your Still grade is 9" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}else if(carbonContent < 0.7 && tensileStrength > 5600){
			System.out.println("Your Still grade is 8" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}else if(hardness > 50 && tensileStrength > 5600){
			System.out.println("Your Still grade is 7" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}else if(hardness > 50 || carbonContent < 0.7  || tensileStrength > 5600 ){
			System.out.println("Your Still grade is 6" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}else{
			System.out.println("Your Still grade is 5" + "\nHardness is " + hardness+ "\nCarbon Content " + carbonContent + "\nTensile Strength " + tensileStrength);
		}

	}
}
