public class Prob4{
    public static void main(String[] args){
        int[]A = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        
        int sum = 0;
        //System.out.println("Array element 15: " + A[15]);
        
        for(int i = 0; i < 15; i++){
            sum += A[i];
        
        }
        
        int min = A[0];
        
        for(int i = 0; i < 15; i++){
            if(A[i] < min){
                min = A[i];
            }
        }
        
        
        
        A[15] = sum;
        A[16] = sum/15;
        A[17] = min;
        
        System.out.println("A[15]: " + A[15]);
        System.out.println("A[16]: " + A[16]);
        System.out.println("A[17]: " + A[17]);
    
    
    } 


    }
    

