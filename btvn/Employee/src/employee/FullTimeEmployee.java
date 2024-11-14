
package employee;

public class FullTimeEmployee extends Employee
{
    
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary()
    {
        return this.getPaymentPerHour() * 8;
    }
    @Override
    public String toString()
    {
        return String.format("%s %d %d", this.getName(), this.getPaymentPerHour(), this.calculateSalary());
    }
}
