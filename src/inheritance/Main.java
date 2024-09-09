package inheritance;

import inheritance.model.Programmer;

public class Main {
    public static void main(String[] args) {

        // create a new instance of Programmer
        Programmer programmer = new Programmer();
        System.out.println("Programmer's salary: " + programmer.printSalary());
        System.out.println("Programmer's bonus: " + programmer.signUpBonus);

        Programmer programmer2 = new Programmer();
        System.out.println(programmer2.printSalary(6000));
    }
}