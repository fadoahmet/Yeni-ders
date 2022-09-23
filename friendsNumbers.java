import java.util.Scanner;

public class friendsNumbers {
    public static void main(String[] args) {
        // 220-284
        var scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number1 = scanner.nextInt();
        System.out.print("enter a number: ");
        int number2 = scanner.nextInt();
        scanner.close();
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.println("These two numbers are friends");
        } else {
            System.out.println("These two numbers are not friedns");
        }

    }

}
