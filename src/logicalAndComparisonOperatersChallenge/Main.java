package logicalAndComparisonOperatersChallenge;

import logicalAndComparisonOperatersChallenge.weightGuru.WeightGuru;
import logicalAndComparisonOperatersChallenge.utils.PrinterHelper;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args){

        char option;
        float weight = 0;
        float height = 0;

        Scanner scanner = new Scanner(System.in);

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

            PrinterHelper.showWeightMenu();
            weight = scanner.nextFloat();

            PrinterHelper.showHeightMenu();
            height = scanner.nextFloat();

            // create an instance of Grader to store the grade
            // and print out the grade by calling method showGrade()
            WeightGuru weightGuru = new WeightGuru(weight, height);
            PrinterHelper.showBMIFeedback(weightGuru.calculateBMI());

            // exit the program after grade is displayed
            exit(0);

        }while(option != 'b');

        System.out.println("Thank you and good bye.");
    }
}
