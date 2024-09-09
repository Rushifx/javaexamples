package interfaces.model;

public class Designer implements Employee{

    private String firstName;
    private String lastName;

    public Designer(String firstName, String lastName) {
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