package logicalAndComparisonOperatersChallenge.utils;

public class PrinterHelper {
    public static void showMainMenu(){
        System.out.println("*----Check your BMI ----*");
        System.out.println("* Select an option:     *");
        System.out.println("* a. Enter your BMI     *");
        System.out.println("* b. Exit program       *");
        System.out.println("*-----------------------*");
    }

    public static void showWeightMenu(){
        System.out.println("*-- Enter weight (kg) --*");
    }

    public static void showHeightMenu(){
        System.out.println("*-- Enter height (cm) --*");
    }

    public static void showBMIFeedback(float BMI){
        System.out.println("*---- BMI Result(s) ----*");
        // create a variable to store the feedback

        String feedback = "";

        if(BMI < 18.5d)
            feedback = "Underweight";
        else if(BMI >= 18.5d && BMI <= 22.9d)
            feedback = "Normal";
        else if(BMI >= 23.0d && BMI <= 29d)
            feedback = "Overweight";
        else if(BMI >= 30)
            feedback = "Obese";
        else
            feedback = "Unable to calculate";

        System.out.println("Your BMI: " + BMI);
        System.out.println("You are " + feedback);
    }
}
