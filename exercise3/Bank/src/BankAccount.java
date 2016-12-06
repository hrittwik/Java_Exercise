
public class BankAccount {
	public int accNo;
	public String customerName;
	public String accType;
	public float balance;
	
	public BankAccount(int accNo, String customerName, String accType, float balance){
		this.accNo = accNo;
		this.customerName = customerName;
		this.accType = accType;
		
		try{
			float b = balance;
			
			if(b < 0){
				throw new NegativeAmount("You can't deposit Negative Amount");
			}else if(this.accType.equals("current") && b < 5000){
				throw new LowBalanceException("Please deposit atleast 5000");
			}else if(this.accType.equals("savings") && b < 1000){
				throw new LowBalanceException("Please deposit atleast 1000 ");
			}else{
				this.balance = balance;
				System.out.println("Your Balance is: " + this.balance);
			}
		}catch (LowBalanceException e) {
			System.out.println("enter valid balance " + e);
		}catch (NegativeAmount e){
			System.out.println("enter valid balance " + e);
		}
	}
	
	
	public void deposit(float amt){
		try{
			float amount = amt;
			if(amount < 0){
				throw new NegativeAmount("You can't deposit negative amount");
			}else{
				this.balance += amount;
			}
		}catch(NegativeAmount e){
			System.out.println("Enter a valid input");
		}
	}
	
	public void withdraw(float amt){
		try{
			
			
			if(this.accType.equals("savings") && (this.balance - amt) < 1000){
				throw new LowBalanceException("You don't have enough balance ");
			}else if(this.accType.equals("current") && (this.balance - amt) < 5000){
				throw new LowBalanceException("You don't have enough balance ");
			}else if(amt < 0){
				throw new NegativeAmount("You can't enter negative value.");
			}else{
				this.balance -= amt;
			}
		}catch (LowBalanceException e) {
			System.out.println("Enter a valid input " + e);	
		}catch(NegativeAmount e){
			System.out.println("Enter a valid input " + e);	
		}
		
	}
	
	public void getBalance(){
		System.out.println("your current balance is: " + this.balance);
	}
}
