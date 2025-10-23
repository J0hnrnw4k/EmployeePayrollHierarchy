public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "Base-Salaried " + super.toString() + ", Base Salary: $" + baseSalary;
    }
}