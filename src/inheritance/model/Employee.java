package inheritance.model;

public class Employee {
    public float salary = 4000;    // salary is private by default

    //default public method printSalary
    public float printSalary(){
        return salary;
    }

    // overload printSalary(float salary)
    public float printSalary(float salary){
        this.salary = salary;
        return salary;
    }
}
