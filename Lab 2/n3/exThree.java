package n2.n3;

import java.util.Scanner;

public class exThree {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int lenght, width, height;

        System.out.println("enter lenght : ");
        lenght = scanner.nextInt();

        System.out.println("enter width : ");
        width = scanner.nextInt();

        System.out.println("enter height : ");
        height = scanner.nextInt();

        int cube = lenght * width * height;

        System.out.println("cube volumn is "+cube);

    }
    
}
