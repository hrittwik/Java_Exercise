import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class Number {
	public int firstNumber;
	public int secondNumber;
	
	public double result;
	
	Number(int fn, int sn){
		this.firstNumber = fn;
		this.secondNumber = sn;
	}
	
	public void add(){
		result = this.firstNumber + this.secondNumber;
		System.out.println("Addition: " + result);
	}
	
	public void sub(){
		result = this.firstNumber - this.secondNumber;
		System.out.println("Subtraction: " + result);
	}
	
	public void mul(){
		result = this.firstNumber * this.secondNumber;
		System.out.println("Multiplication: " + result);
	}
	
	public void div(){
		try{
			result = this.firstNumber/this.secondNumber;
			System.out.println("Division: " + result);
		}catch(ArithmeticException e){
			System.out.println("Cannot Divide by zero!");
		}
	}
}
