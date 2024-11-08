
package bai5;
import java.util.*;
import java.io.*;

public class Bai5 
{
    public static class Student implements Comparable <Student>
    {
        private String id, name, Class, email, phone_number;

        public Student(String id, String name, String Class, String email, String phone_number) {
            this.id = id;
            this.name = name;
            this.Class = Class;
            this.email = email;
            setPhone_number(phone_number);
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = "0" + phone_number;
        }
        @Override
        public int compareTo(Student o)
        {
            if(this.Class.equals(o.Class))
            {
                return this.id.compareTo(o.id);
            }
            return this.Class.compareTo(o.Class);
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s %s %s", this.id, this.name, this.Class, this.email, this.phone_number);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> arl = new ArrayList<>();
        while(sc.hasNextLine())
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String email = sc.nextLine();
            String phone_number = sc.nextLine();
            arl.add(new Student(id, name, Class,email, phone_number));
        }
        Collections.sort(arl);
        for(Student i: arl)
        {
            System.out.println(i);
        }
    }
    
}
