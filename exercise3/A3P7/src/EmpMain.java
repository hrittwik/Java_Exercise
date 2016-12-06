
public class EmpMain {
	public static void main(String[] args){
		Emp e = new Emp(1, "A", "Officer", 1000);
		
		e.printDetails();
		e.calculateHRA();
		System.out.println( ((10 / 100) * 500));
	}
}
