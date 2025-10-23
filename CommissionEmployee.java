public class CommissionEmployee extends Employee {
    private double grossSales;     // total sales
    private double commissionRate; // percentage

    public CommissionEmployee(String firstName, String lastName, String ssn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) { this.grossSales = grossSales; }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "Commission Employee: " + super.toString()
                + ", Gross Sales: $" + grossSales
                + ", Commission Rate: " + commissionRate;
    }
}