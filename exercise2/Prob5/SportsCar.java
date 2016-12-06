
class SportsCar extends Car{
	int initspeed,gearstatus;

	public void airballontype()
	{
		initspeed=120;
		gearstatus=1;
	}

	void display()
	{
		super.display();
		System.out.println("Starting speed of a SPORTS Car is:"+initspeed);
		System.out.println("no of gear in the SPORTS car is:"+gearstatus);
	}
} 
