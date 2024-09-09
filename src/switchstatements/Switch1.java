package switchstatements;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        int userInput = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 - 3:");

        userInput = scanner.nextInt();

        switch (userInput){
            case 0:
                System.out.println("is 0");
                break;
            case 1:
                System.out.println("is 1");
                break;
            case 2:
            case 3:
                System.out.println("is either 2 or 3");
                System.out.println("Actual input: " + userInput);
                break;
            default:
                System.out.println("value is invalid");
        }
    }

}
