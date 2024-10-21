package j06003;
import java.util.*;
import java.io.*;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:\\code visual studio\\java_ptit\\J06003\\src\\file.txt"));
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Management> arl = new ArrayList<>();
        Map<Integer, String> mp = new LinkedHashMap<>();
        for(int i=1;i<=n;i++)
        {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            String phone_number = sc.nextLine();
            int group = sc.nextInt();
            arl.add(new Management(id, name, phone_number, group));
        }
        sc.nextLine();
        for(int i=1;i<=m;i++)
        {
            String ex_name = sc.nextLine();
            mp.put(i, ex_name);
        }
        int num_ques = sc.nextInt();
        while(num_ques -- > 0)
        {
            int query = sc.nextInt();
            System.out.printf("DANH SACH NHOM %s:\n", query);
            for(Management i: arl)
            {
                if(i.getGroup() == query)
                {
                    System.out.println(i);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n", mp.get(query));
        }
    }
    
}
