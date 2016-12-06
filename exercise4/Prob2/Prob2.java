import java.io.*;
import java.util.Scanner;
public class Prob2{
    public static void main(String[] args){

	        try{

                  // Should use FileWriter in case of writing characters
                  BufferedWriter out= new BufferedWriter(new FileWriter("TESTING.txt", true));

                  //PrintWriter out = new PrintWriter(new FileOutputStream("TESTING.txt", true));
	                String userInput = ("");

	                //needed for user to input selection
	                Scanner input = new Scanner(System.in);

	                System.out.println("Please enter your Roll Number: ");
	                userInput = userInput.concat(input.nextLine());

	                System.out.println("Please enter your Name: ");
	                userInput = userInput.concat(" " +input.nextLine());

	                System.out.println("Please enter the Age: ");
	                userInput = userInput.concat(" " +input.nextLine());

                  System.out.println("Please enter the Address: ");
	                userInput = userInput.concat(" " +input.nextLine());

                  //System.out.println(userInput);
                  //out.println(userInput);
	                out.write(userInput);//Write out a string to the file
                  out.newLine();
                  //out.write(nastyHack); //write a new line to the file on the next line
	                out.close();//flushes and closes the stream
	            }
	            catch(IOException e){
	                System.out.println("There was a problem:" + e);
	            }




                try {
                    InputStream input = new BufferedInputStream(new FileInputStream("TESTING.txt"));
                    byte[] buffer = new byte[8192];
                    for (int length = 0; (length = input.read(buffer)) != -1;) {
                        System.out.write(buffer, 0, length);
                    }
                    input.close();
                }catch(IOException e){
                    System.out.println("There was a problem: " + e);
                }


	    }


}
