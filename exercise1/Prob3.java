public class Prob3{
    public static void main(String[] args){
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        
        int[] a = {7, 25, 5, 19, 30};
    	
    	
        
        boolean b1 = isValid(i1);
        boolean b2 = isValid(i2);
        
        boolean b3 = doesExist(i1);
        boolean b4 = doesExist(i2);
        
        if (b1 == true && b2 == true){
            if(b3 == true && b4 == true){
                System.out.println("It's Bingo");
            }
            else{
                System.out.println("Not Found");
            } 
        }
        
        
    }
        
    public static boolean isValid(int i){
        if( i > 0 && i < 41 ){
            System.out.println("Your second number was " + i);
            return true;
        }else{
            System.out.println("Your second number is not in the range from 1 to 40");
            return false;
        }
    }
    
    public static boolean doesExist(int integer){
    	int[] a = {7, 25, 5, 19, 30};
    	
    	for(int i = 0; i < a.length; i++){
            if(a[i] == integer){
                return true;
            }
        }
        return false;
    
    } 
         
        
}




