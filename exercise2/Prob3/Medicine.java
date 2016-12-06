class Medicine{


	String medicineName;
	String companyName;
	// a constructor
	public Medicine(){
		System.out.println("This is default constructor" );
	}
	public Medicine( String medicineName, String companyName ) {
		this.medicineName = medicineName;
		this.companyName = companyName;
	}
	// some methods
	public void displayLabel() {
	System.out.println("Medicine " + medicineName );
	}




} 
