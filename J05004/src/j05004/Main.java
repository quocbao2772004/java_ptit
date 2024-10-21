package j05004;
import java.util.*;
import java.io.*;
public class Main 
{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        ArrayList<Student> arl = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sc.nextLine();
            String id = "B20DCCN" + String.format("%03d", i);
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = sc.nextDouble();
            arl.add(new Student(id, name, Class, dob, gpa));
        }
        for(Student i:arl)
        {
            System.out.println(i);
        }
    }
    
}
