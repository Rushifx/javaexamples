package interfaces;

import interfaces.model.Designer;
import interfaces.model.Programmer;

public class Main {

    public static void main(String[] args) {

        // create an instance of the Designer class - called designer
        Designer designer = new Designer("Sam", "Smith");
        designer.displayName();
        designer.displayAnnualLeave();

        Programmer programmer = new Programmer("John", "Doe");
        programmer.displayName();
        programmer.displayAnnualLeave();

    }

}
