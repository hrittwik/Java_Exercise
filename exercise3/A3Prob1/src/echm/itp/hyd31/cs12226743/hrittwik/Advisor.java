package echm.itp.hyd31.cs12226743.hrittwik;

import java.util.Random;

public class Advisor{
	String[] message = new String[5];
	
	
	
	public Advisor(){
		//String[] message = new String[5];
		message[0] = "Avoid creating useless objects";
		message[1] = "Get the basics right";
		message[2] = "Don’t just read";
		message[3] = "Understand your code and algorithm";
		message[4] = "Do not forget to allocate memory";
		
			
	}
	
	public void getAdvice(){
		Random rand = new Random();
		int n = rand.nextInt(4);
		System.out.println(message[n]);
		
		//return message[n];
		
		
	}
	
}
