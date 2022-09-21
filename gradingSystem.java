public class gradingSystem {
    public static void main(String[] args) {
        char grade ='F';

        switch(grade) {
            case 'A':
                System.out.println("perfect: you passed");
                break;
            case 'B':
                System.out.println("very good: you passed");
                break;
            case 'C':
                System.out.println("good: you passed");
                break;
            case 'D':
                System.out.println("not bad: you passed");
                break;
            case 'F':
                System.out.println("unfortunately you failed");
                break;
            default:
                System.out.println("you entered an invalid grade");
        }
        
    }
    
}
