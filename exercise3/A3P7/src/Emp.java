
public class Emp {
	public int empId;
	public String empName;
	public String designation;
	public double basic;
	public double HRA;
	
	public Emp(int empId, String empName, String designation, double basic){
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		
		try{
			if(basic < 500){
				throw new LowSalException("Basic cannot be less than 500");
			}else{
				this.basic = basic;
			}
		
		}catch (Exception e) {
			System.out.println("Basic should be 500");
		}
				
	}
	
	public void printDetails(){
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee Designation: " + this.designation);
		System.out.println("Employee basic: " + this.basic);
		
	}
	
	public void calculateHRA(){
		if(this.designation.equals("Manager")){
			HRA = (0.1*this.basic);
			System.out.println("HRA : " + HRA);
		}else if(this.designation.equals("Officer")){
			HRA = 0.12*this.basic;
			System.out.println("HRA : " + HRA);
		}else if(this.designation.equals("Clerk")){
			HRA = (0.5*this.basic);
			System.out.println("HRA : " + HRA);
		}
	}
	
	
	
}
