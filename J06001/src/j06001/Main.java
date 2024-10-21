package j06001;
import java.util.*;
import java.io.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        int n = sc.nextInt();
        ArrayList<Bill> arl = new ArrayList<>();
        sc.nextLine();
       
        for (int i = 1; i <= n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long price1 = Long.valueOf(sc.nextLine());
            long price2 = Long.valueOf(sc.nextLine());
            arl.add(new Bill(id, name, price1, price2));
        }

        int m = sc.nextInt();
//        System.out.println(m);
        for (int i = 1; i <= m; i++) 
        {
            String id_type = sc.next();
            String c = String.valueOf(i);
            while (c.length() < 3) c = "0" + c;
            String id = id_type.substring(0, 2);
            int type = id_type.charAt(id_type.length() - 1) - '0';
            long quantity = sc.nextLong();
//            System.out.println(id);
            for (Bill bill : arl)
            {
                if (bill.getId().equals(id)) 
                {
                    bill.setId(id_type + "-" + c);  
                    bill.setQuantity(quantity);
                    bill.setTotal(type);
                    bill.setDiscount();  
                    System.out.println(bill);  
                    bill.setId(id);
                }
            }
        }
    }
}