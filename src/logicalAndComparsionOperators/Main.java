package logicalAndComparsionOperators;

import logicalAndComparsionOperators.grader.Grader;
import logicalAndComparsionOperators.utils.PrinterHelper;

import java.awt.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    /*
        Objective is to track the following inputs:
        1. "Failed" if they scored 3 or less
        2. "Insufficient" if they scored > 3 but less than 5. (5 included)
        3. "Good" if they scored > 5 but less than 8. (8 included)
        4. "Excellent" Grade if they scored 10.
        5. Provide feedback, if participants enter a negative number or a number outside the range (outside 0 - 10)
    */

    public static void main(String[] args){

        // Initialise option to start with an int of 0
        char option;
        int grade = 0;

        // Create instance of a Scanner object
        // Use 'System.in" connects to the keyboard to capture user input when the program executes
        Scanner scanner = new Scanner(System.in);

        // Do while user does not type in a value of 2 (exit program)
        do {

            // showMainMenu() asks for the user input, stored in variable option
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);

            // Only allow values 'a' and 'b'
            if(option != 'a'){
                continue; // continue the do while loop
            }else if(option == 'b'){
                break;    // break out of do while loop
            }

            // showGradeMenu() asks for the user grade, stored in variable grade
            PrinterHelper.showGradeMenu();
            grade = scanner.nextInt();

            // create an instance of Grader to store the grade
            // and print out the grade by calling method showGrade()
            Grader grader = new Grader(grade);
            PrinterHelper.showGradeFeedback(grader.showGrade());

            // exit the program after grade is displayed
            exit(0);

        }while(option != 'b');

        System.out.println("Thank you and good bye.");
    }
}
