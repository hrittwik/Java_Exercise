import java.util.Scanner;


public class Prob11{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		System.out.println("The input is: " + word);

		char[] charArray = word.toCharArray();

		String B = reverse(charArray);

		System.out.println("Reversed String "+ B);

		boolean b = isPalindrome(charArray);

		if(b == true){
			System.out.println("Original and Reversed numbers are same");
		}else{
			System.out.println("Original and Reversed numbers are not same");
		}

	}

    public static String reverse(char[] word){
        //char[] in = input.toCharArray();
        int begin = 0;
        int end = word.length-1;
        char temp;

        while( end > begin){
            temp = word[begin];
            word[begin] = word[end];
            word[end] = temp;
            end--;
            begin++;
        }
        return new String(word);
    }



    public static boolean isPalindrome(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

}
