package ifconditions;


import java.util.Scanner;

public class Main {

    static enum Gender{ // enumerated data type
        MALE,   // 0
        FEMALE  // 1
    }

    public static void main(String[] args) {

        String name, tempGender;
        int age;
        Gender gender;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name:");
        name = scanner.nextLine();

        System.out.print("Please enter your age:");
        age = Integer.parseInt(scanner.nextLine());

        // if the user's age is above 20 and is male, provide the user a specific message
        // otherwise render another message for the female

        System.out.print("Please enter your gender:");
        tempGender = scanner.nextLine();

        // update the variable called gender
        if(tempGender.equals("M"))
            gender = Gender.MALE;
        else
            gender = Gender.FEMALE;

        // nested if conditions
        if(age > 20){
            // check with the user is male or female to render the output
            if(gender == Gender.MALE)
                System.out.println("Welcome Mr. " + name);
            else
                System.out.println("Welcome Ms. " + name);
        }else{
            // user is not of age to attend the event - provide a message
            System.out.println("You are not eligible for the even.");
        }
    }
}
