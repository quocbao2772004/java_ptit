package j06004;
import java.util.*;
import java.io.*;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
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
        Collections.sort(arl);
        for(Management i: arl)
        {
            i.setEx_name(mp.get(i.getGroup()));
            System.out.println(i);
       
        }
        
        
    }
    
}
