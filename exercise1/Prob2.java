public class Prob2 {
	public static void main(String[] args){
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        
        
        System.out.println(i1);
        System.out.println(i2);
        
        for(int i = 0; i < 13; i++ ){
            int i3 = i1 + i2; 
            System.out.println(i3);
            i1 = i2;
            i2 = i3;
        
        }   
        		
	}
}

