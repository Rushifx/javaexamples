package loops;

import java.util.Scanner;

public class WhileActivity {

    public static String requestForInput(Scanner scanner){
        // Print the question
        System.out.println("What is your favourite day?");
        System.out.println("Press Q to quit.");

        // return the user's input
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        String day = "";
        Scanner scanner = new Scanner(System.in);

        do {
            day = requestForInput(scanner);

            //Print out the result from day
            switch (day.trim().toUpperCase()){
                case "MONDAY":
                    System.out.println("Monday blues");
                    break;
                case "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY":
                    System.out.println("Hurrah");
                    break;
                case "SUNDAY":
                    System.out.println("Everyday is a sunday");
                    break;
                default:
                    break;
            }

        }while (day.trim().compareToIgnoreCase("Q") != 0);

    }
}
