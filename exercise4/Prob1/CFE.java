import java.io.*;
import java.util.Scanner;
class CFE {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Must specify file on the command line");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        File f1 = new File(args[0]);
        if (f1.exists()){
            System.out.println("Source File exists");
        } else {
            System.out.println("Source File does not exist, You can't copy if there is no source file");
                System.exit(0);
        }

        File f2 = new File(args[1]);
        if (f2.exists()) {
            System.out.println("Destination File exists, Do you want to overwrite?Y/N");
                if(userInput() == true){
                    copyFile(sourceFile, destinationFile);
                }
        } else {
            System.out.println("Destination File does not exist, it'll be created automatically");
            copyFile(sourceFile, destinationFile);
        }

    }

    public static void copyFile(String sf, String df){
        try {

            FileInputStream in = new FileInputStream(sf);
            FileOutputStream out = new FileOutputStream(df);

            byte[] buf = new byte[1024];
            int i = 0;
            while ((i = in.read(buf)) != -1) {
                out.write(buf, 0, i);
            }
            in.close();
            out.close();
            System.out.println("Copied Successfully");
        } catch(IOException e) {
            System.out.println("Error copying file");
        }
    }

    public static boolean userInput(){
        Scanner scan = new Scanner(System.in);
        char i = scan.next().charAt(0);

        if(i == 'Y' || i == 'y'){
            return true;
        }else{
            return false;
        }

    }
}
