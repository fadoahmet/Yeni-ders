public class findNumber {

    public static void main(String[] args) {
        
        int number1 = 266;
        int number2 = 278;
        int number3 = 264;

        int max = number1;  

        if(max<number2) {

            max = number2;
        }

        if(max< number3) {

            max = number3;
        }

        System.out.println("MAX:"+ max);
    }
    
}
