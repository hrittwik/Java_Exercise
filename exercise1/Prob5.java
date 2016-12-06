public class Prob5{
    public static void main(String[] args){
        int investment = 14000;
        
        int ValueAfterFirstYear = 14000 + ((14000*40) / 100);
        int ValueAfterSecondYear = ValueAfterFirstYear - 1500;
        int ValueAfterThirdYear = ValueAfterSecondYear + ((ValueAfterSecondYear * 12)/100); 
        
        System.out.println("Calculated investment worth: " + ValueAfterThirdYear);   
    }


}
