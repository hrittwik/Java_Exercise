import java.util.Scanner;


public class Prob12{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Gender 'male' for Male and 'female' for female:");
		String gender = scan.next();
        System.out.println("Enter your Age:");
        int age = scan.nextInt();
        System.out.println("Enter your Health confition 'good' for good and 'bad' for not good:");
        String healthCondition = scan.next();
        System.out.println("Enter your location 'city' for City and 'village' for village:");
        String location = scan.next();

        int premiumAmount, policyAmount;

        if((age>=25 && age<=35)&&(healthCondition.equals("good"))&&(location.equals("city"))&&(gender.equals("male")))
        {
            premiumAmount = 4;
            policyAmount = 2;
            System.out.println("Person is Insured"+"\nPayble Premium: "+premiumAmount+" Thousands"+"\nPolicy Ammount is: "+policyAmount+" Lakh");
        }

        else if((age>=25 && age<=35)&&(healthCondition.equals("good"))&&(location.equals("city"))&&(gender.equals("female")))
        {
            premiumAmount = 3;
            policyAmount = 1;

            System.out.println("Person is Insured"+"\nPayble Premium: "+premiumAmount+" /Thousands"+"\nPolicy Ammount is: "+policyAmount+" Lakh");
        }

        else if((age>=25 && age<=35)&&(healthCondition.equals("bad"))&&(location.equals("village"))&&(gender.equals("male")))
        {
            premiumAmount = 6;
            policyAmount = 10;

            System.out.println("Person is Insured"+"\nPayble Premium: "+premiumAmount+" /Thousands"+"\nPolicy Ammount is: "+policyAmount+" Thousands");
        }

        else{
            System.out.println("Person is not Insured");

        }
    }

}
