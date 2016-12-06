import echm.itp.hyd31.cs12226743.hrittwik.Advisor;
import echm.itp.hyd31.cs12226743.hrittwik.Greeter;


public class GreeterTest {
	public static void main(String[] args){
		
		Greeter first = new Greeter(args[0]);
		Greeter second = new Greeter(args[1]);
		Advisor yo = new Advisor();
		
		System.out.println(first.sayHello());
		System.out.println(second.sayHello());
		yo.getAdvice();
		System.out.println(second.goodBye());
		System.out.println(first.goodBye());
	}
}
