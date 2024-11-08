
package j04012;

public class Employee 
{
    private String name, position;
    private long basic_salary;
    private int days;

    public Employee(String name, long basic_salary, int days, String position) 
    {
        this.name = name;
        this.position = position;
        this.basic_salary = basic_salary;
        this.days = days;
    }
    public long getSalary()
    {
        return basic_salary * days;
    }
    public long getBonus()
    {
        if(days>=25) return this.getSalary() * 20 / 100;
        else if(days>=22 && days<=25) return this.getSalary() * 10 /100;
        else return 0;
    }
    public long getAllowances()
    {
        if(position.equals("GD")) return 250000;
        if(position.equals("PGD")) return 200000;
        if(position.equals("TP")) return 180000;
        return 150000;
    }
    public long getIncome()
    {
        return this.getSalary() + this.getBonus() + this.getAllowances();
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %d %d %d %d", "NV01", name, this.getSalary(), this.getBonus(), this.getAllowances(), this.getIncome());
    }
}
