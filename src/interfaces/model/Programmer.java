package interfaces.model;

public class Programmer implements Employee{

    // The variable annualLeave here belongs to Programmer class
    // The final keyword makes the value immutable (cannot be changed)
    private final int annualLeave = Employee.annualLeave;

    private String firstName;
    private String lastName;

    public Programmer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void displayAnnualLeave() {
        System.out.println("Annual Leave: " + annualLeave);
    }

    @Override
    public void displayName() {
        System.out.println(firstName + " " + lastName);
    }
}
