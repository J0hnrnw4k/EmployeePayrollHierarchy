public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSsn() { return ssn; }

    // Abstract method - must be implemented by subclasses
    public abstract double earnings();

    @Override
    public String toString() {
        return firstName + " " + lastName + " (SSN: " + ssn + ")";
    }
}