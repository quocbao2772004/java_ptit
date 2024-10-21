package j05021;
import java.util.*;
import java.io.*;
public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        ArrayList<Student> arl = new ArrayList<>();
        while(sc.hasNextLine())
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String email = sc.nextLine();
            arl.add(new Student(id, name, Class, email));
        }
        Collections.sort(arl);
        for(Student i:arl)
        {
            System.out.println(i);
        }
    }
    
}
