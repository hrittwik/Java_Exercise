package echm.itp.hyd31.cs12226743.hrittwik;

public class Greeter {
	String name;
	
	public Greeter(String aName){
		this.name = aName;
	}
	
	public String sayHello(){
		return "Hello " + name; 
	}
	
	public String goodBye(){
		return "Goodbye" + name;
	}
}
