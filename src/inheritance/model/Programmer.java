package inheritance.model;

public class Programmer extends Employee {
    public int signUpBonus = 1000;   // signUpBonus is private by default

    // method printSalary overrides the behavior of that from Employee class
    @Override
    public float printSalary(){
        return salary + signUpBonus;
    }
}
