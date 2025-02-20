import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        EvenOddNumber evenOddNumber = new EvenOddNumber();

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        boolean isEven = evenOddNumber.findEvenOdd(number);
        if (isEven) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();

    }
}
