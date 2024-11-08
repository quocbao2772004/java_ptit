
package bai9;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai9 
{
    
    public static class product
    {
        private String id, name;
        private int price, time;

        public product(String id, String name, int price, int time) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.time = time;
        }
        
    }
    public static class client implements Comparable<client>
    {
        private String id, name, address, id_pro;
        private int quantity;
        private String time;
        private int price;
        public client(String id, String name, String address, String id_pro, int quantity, String time, int price) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.id_pro = id_pro;
            this.quantity = quantity;
            this.time = time;
            this.price = price;
        }
        @Override
        public int compareTo(client o)
        {
            String[] set1 = this.time.split("/");
            String[] set2 = o.time.split("/");
            int day1 = Integer.valueOf(set1[0]);
            int day2 = Integer.valueOf(set2[0]);
            int month1 = Integer.valueOf(set1[1]);
            int month2 = Integer.valueOf(set2[1]);
            int year1 = Integer.valueOf(set1[2]);
            int year2 = Integer.valueOf(set2[2]);
            if(year1 == year2)
            {
                if(month1 == month2)
                {
                    if(day1==day2)
                    {
                        return this.id.compareTo(o.id);
                    }
                    return Integer.compare(day1, day2);
                }
                return Integer.compare(month1, month2);
            }
            return Integer.compare(year1, year2);
        }

        
    }
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<product> arl = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.valueOf(sc.nextLine());
            int time = Integer.valueOf(sc.nextLine());
            arl.add(new product(id, name, price, time));
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<client> arl2 = new ArrayList<>();
        for(int i=1;i<=m;i++)
        {
            String id = String.format("KH%02d", i);
            String name = sc.nextLine();
            String address = sc.nextLine();
            String id_pro = sc.nextLine();
            int quantity = Integer.valueOf(sc.nextLine());
            String time = sc.nextLine();
            String[] set = time.split("/");
            for(product j: arl)
            {
                if(j.id.equals(id_pro))
                {
                    int baohanh = j.time;
                    int year = baohanh/12;
                    int month = baohanh - year*12;
                    if(month + Integer.valueOf(set[1])>12)
                    {
                        year+=1;
                        month = month + Integer.valueOf(set[1]) - 12;
                    }
                    else
                    {
                        month = month + Integer.valueOf(set[1]);
                    }
                    String new_time = set[0] + "/" + String.format("%02d",month) + "/" + String.valueOf(year+Integer.valueOf(set[2]));
                    arl2.add(new client(id, name, address, id_pro, quantity, new_time, j.price));
//                    System.out.println(new_time);
//                    System.out.println("baohanh: "+baohanh);
//                    System.out.println("year:"+year);
//                    System.out.println("month:"+month);
  
                    break;
                }
            }
            
        }
        Collections.sort(arl2);
        for(client c: arl2)
        {
            System.out.println(c.id + " "+  c.name + " "+ c.address + " "+ c.id_pro + " "+ c.quantity*c.price +" "+ c.time);
        }
        
    }
    
}
