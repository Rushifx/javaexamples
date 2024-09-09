package switchstatements;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favourite day of the week:"); // Monday or MONDAY
        day = scanner.next();

        switch (day.toLowerCase()){
            case "monday":
                System.out.println("Monday blues!");
                break;
            case "tuesday", "wednesday", "thursday", "friday", "saturday":
                System.out.println("Hurrah!");
                break;
            default:
                System.out.println("Everyday is a Sunday!");
                break;
        }

    }
}
