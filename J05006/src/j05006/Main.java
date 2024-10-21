package j05006;
import java.util.*;
import java.io.*;
public class Main 
{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        ArrayList<Employee> arl = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
           
            String id = String.format("%05d", i);
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String addr = sc.nextLine();
            String code = sc.nextLine();
            String signing_date = sc.nextLine();
            arl.add(new Employee(id, name, gender, dob, addr, code, signing_date));
        }
        
        for(Employee i:arl)
        {
            System.out.println(i);
        }
        
        
    }
    
}
