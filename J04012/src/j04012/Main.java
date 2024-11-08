package j04012;
import java.util.*;
import java.io.*;
public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        ArrayList<Employee> arl = new ArrayList<>();
        String name = sc.nextLine();
        long basic_salary = sc.nextLong();
        int days = sc.nextInt();
        String pos = sc.next();
        arl.add(new Employee(name, basic_salary, days, pos));
        for(Employee i:arl)
        {
            System.out.println(i);
        }
    }
    
}
