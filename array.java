public class array {
    public static void main(String[] args) {
        
        double[] myList ={2.5,3.6,4.5,9.8};
        double total=0;
        double  max= myList[0];

        for(double number:myList) {
            if(max<number) {
                max = number;
            }

            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total:  " + total);
        System.out.println("MAX="+ max);

    }
    
}
