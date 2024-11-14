
package employee;

public class PartTimeEmployee extends Employee
{
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) 
    {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    public int calculateSalary()
    {
        return this.getPaymentPerHour() * workingHours;
    }

    public void setWorkingHours(int workingHours) {
        if(workingHours < 8)
            this.workingHours = workingHours;
        else
            System.out.println("Over 8 hours a day is not part time");
    }
    @Override 
    public String toString()
    {
        return String.format("%s %d %d %d" ,this.getName(), this.getPaymentPerHour(), this.workingHours, this.calculateSalary());
    }
    
}
