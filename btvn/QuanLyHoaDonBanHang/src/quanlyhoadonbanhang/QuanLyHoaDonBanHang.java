
package quanlyhoadonbanhang;
import java.util.*;

public class QuanLyHoaDonBanHang 
{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Customer customer1 = new Customer("Ha Noi", "BYSJC", "EDOGAWA CONAN");
        Customer customer2 = new Customer("Ba Vi", "BUWJCW", "HAIBARA AI");
        Customer customer3 = new Customer("Quang Ninh", "UEFJEM", "JACK THE RIPPER");
        Currency usd = Currency.getInstance("USD");
        Currency jpy = Currency.getInstance("JPY");
        Currency eur = Currency.getInstance("EUR");
        OrderLine line1  = new OrderLine(usd);
        OrderLine line2 = new OrderLine(jpy);
        OrderLine line3 = new OrderLine(eur);
        
        Order order1 = new Order(customer1, usd);
        order1.addLine(line1);
        order1.addLine(line3);
        Order order2 = new Order(customer2, usd);
        order2.addLine(line2);
        Order order3 = new Order(customer3, usd);
        order3.addLine(line3);
        OrderList orderList = new OrderList();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        System.out.println("Total orders: " + orderList.getCount());
        System.out.println("");
        for(Order order: orderList.getOrders())
        {
            System.out.printf("Order for customer has code: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Order Lines:");
            for (OrderLine line : order.getOrderLines()) 
            {
                System.out.println(" - " + line.getValue());
            }
            System.out.println("");
        }
        orderList.remove(order2);
        orderList.remove(order1);
        orderList.remove(order2);
        System.out.println("Total orders: " + orderList.getCount());
        System.out.println("");
        for(Order order: orderList.getOrders())
        {
            System.out.printf("Order for customer has code: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Order Lines:");
            for (OrderLine line : order.getOrderLines()) 
            {
                System.out.println(" - " + line.getValue());
            }
            System.out.println("");
            System.out.println("");
        }
        
    }
    
}
