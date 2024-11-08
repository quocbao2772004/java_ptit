
package bai7;
import java.util.*;
import java.io.*;
import java.math.*;

public class Bai7 
{
    public static class KhachHang
    {
        private String id, name, gender, dob, address;

        public KhachHang(String id, String name, String gender, String dob, String address) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.dob = dob;
            this.address = address;
        }
        
    }
    public static class MatHang
    {
        private String id, name, unit;
        private int price1, price2;

        public MatHang(String id, String name, String unit, int price1, int price2) {
            this.id = id;
            this.name = name;
            this.unit = unit;
            this.price1 = price1;
            this.price2 = price2;
        }
        
    }
    public static class HoaDon
    {
        private String id_client, id_product;
        private int quantity;

        public HoaDon(String id_client, String id_product, int quantity) {
            this.id_client = id_client;
            this.id_product = id_product;
            this.quantity = quantity;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        ArrayList<KhachHang> arl1 = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String id = String.format("KH%03d", i);
            String name = sc1.nextLine();
            String gender = sc1.nextLine();
            String dob = sc1.nextLine();
            String address = sc1.nextLine();
            arl1.add(new KhachHang(id, name, gender, dob, address));
        }
        int n2 = sc2.nextInt();
        sc2.nextLine();
        ArrayList<MatHang> arl2 = new ArrayList<>();
        for(int i=1;i<=n2;i++)
        {
            String id = String.format("MH%03d", i);
            String name = sc2.nextLine();
            String unit = sc2.nextLine();
            int price1 = Integer.valueOf(sc2.nextLine());
            int price2 = Integer.valueOf(sc2.nextLine());
            arl2.add(new MatHang(id, name, unit, price1, price2));
        }
        
        int n3 = sc3.nextInt();
        for(int i=1;i<=n3;i++)
        {
            String id = String.format("HD%03d", i);
            String id_cus = sc3.next();
            String id_pro = sc3.next();
            int quantity = sc3.nextInt();
            System.out.print(id + " ");
            for(KhachHang k: arl1)
            {
                if(k.id.equals(id_cus))
                {
                    System.out.print(k.name + " " + k.address + " ");
                    break;
                }
            }
            for(MatHang k: arl2)
            {
                if(k.id.equals(id_pro))
                {
                    System.out.println(k.name + " " + k.unit + " " + k.price1 + " " + k.price2 + " " + quantity + " " + k.price2 * quantity);
                    break;
                }
//                System.out.println("k.id = " + k.id);
//                System.out.println("id_pro = " + id_pro);
            }
//            System.out.println("");
        }
    }
    
}
