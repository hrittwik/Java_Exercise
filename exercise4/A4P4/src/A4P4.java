import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class A4P4 {
	public static void main(String[] args) throws IOException{
		
		File file = new File("TESTING.txt");
		BufferedWriter out= new BufferedWriter(new FileWriter("TESTING.txt", true));
		//needed for user to input selection
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter a String");
	    String userInput = input.nextLine();
	   
	    out.write(userInput);//Write out a string to the file
        out.newLine();
        out.close();
        
        
        if(file.exists()){
	        double bytes = file.length();
	        double kilobytes = (bytes/1024);
	        double megabytes = (kilobytes/1024);
	        System.out.println("File Size: " + megabytes + " megabytes");
        }else{
        	System.out.println("File not found!!");
        }
        
	    try {
            InputStream input1 = new BufferedInputStream(new FileInputStream("TESTING.txt"));
            byte[] buffer = new byte[8192];
            for (int length = 0; (length = input1.read(buffer)) != -1;) {
                System.out.write(buffer, 0, length);
            }
            input1.close();
        }catch(IOException e){
            System.out.println("There was a problem: " + e);
        }
	    
	    
	    file.delete();
	    System.out.println(file.getName() + " is deleted ");
	}
}
