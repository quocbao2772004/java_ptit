
package quanlyhoadonbanhang;
import java.util.*;

public class OrderList 
{
    private ArrayList<Order> orders = new ArrayList<>();
    public void add(Order order)
    {
        orders.add(order);
    }
    public int getCount()
    {
        return orders.size();
    }
    public Iterator<Order> getIterator()
    {
        return orders.iterator();
    }
    public void remove(Order order)
    {
        if(orders.contains(order))
            orders.remove(order);
        else
            System.out.println("This order is not exist!");
    }
    public ArrayList<Order> getOrders()
    {
        return orders;
    }
}
