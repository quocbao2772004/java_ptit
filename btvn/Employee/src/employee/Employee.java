
package employee;
import java.io.*;
import java.util.Scanner;

public abstract class Employee implements IEmployee
{
    private String name;
    private int paymentPerHour;
    
    public Employee(String name, int paymentPerHour) 
    {
        this.name = name;
        setPaymentPerHour(paymentPerHour);
    }
    @Override
    public String getName() 
    {
        return name;
    }

    public int getPaymentPerHour() 
    {
        return paymentPerHour;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) 
    {
        if(paymentPerHour > 0)
            this.paymentPerHour = paymentPerHour;
        else 
            this.paymentPerHour = 0;
    }
    @Override
    public int calculateSalary()
    {
        return 0;
    }
  
}
