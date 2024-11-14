
package quanlyhoadonbanhang;
import java.util.*;

public class Order
{
    private Customer customer;
    private ArrayList<OrderLine> orderLines = new ArrayList<>();
    private Currency total;
    public Order(Customer customer, Currency total) {
        this.customer = customer;
        this.total = total;
    }
    
    public void addLine(OrderLine Line)
    {
        orderLines.add(Line);
    }
    public ArrayList<OrderLine> getOrderLines() 
    {
        return orderLines;
    }
    public void removeLine(OrderLine line)
    {
        orderLines.remove(line);
    }
    public Customer getCustomer()
    {
        return customer;
    }
   
    public String toString()
    {
        return String.format("Name of customer: %s \nAddress of customer: %s \nCode of customer: %s", customer.getName(), customer.getAddress(), customer.getCode());
    }
}
