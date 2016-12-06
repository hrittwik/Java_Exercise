class TestCompartment{
	public static void main(String ar[]){
		//compartment[] cr=new compartment[10];
		General gr = new General();
		Ladies ld = new Ladies();
		FirstClass fl = new FirstClass();
		Luggage lg = new Luggage();

		gr.notice();
		ld.notice();
		fl.notice();
		lg.notice();
	}
}
