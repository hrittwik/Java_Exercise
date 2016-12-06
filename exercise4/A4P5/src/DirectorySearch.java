
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectorySearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter directory path(ex:C:/Users/ ): ");
		String directoryPath = input.nextLine();
		File file = new File(directoryPath); // current directory
		if(file.exists()){
			displayDirectoryContents(file);
		}else{
			System.out.println("Directory not found");
		}
		
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory: " + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("\t file: " + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}