package interfaces.model;

public interface Employee {

        // annualLeave is a constant that belongs to Employee Interface
        // this variable is a public static and final variable (the value of annualLeave cannot be changed)
        int annualLeave = 7;


        // displayAnnualLeave is an abstract method (aka a method signature)
        void displayAnnualLeave();

        // displayName is also an abstract method (aka a method signature)
        void displayName();

}
