
public class BankMain {
	public static void main(String[] args){
		BankAccount B = new BankAccount(1, "ABCD", "savings", 33330);
		
		
		B.getBalance();
		B.deposit(-10000);
		B.getBalance();
		B.withdraw(40000);
		B.getBalance();
		System.out.println(" ");
		
		BankAccount C = new BankAccount(2, "DCBA", "current", 0);
		C.getBalance();
		C.deposit(10);
		C.getBalance();
		C.withdraw(40);
		C.getBalance();
	}
}
