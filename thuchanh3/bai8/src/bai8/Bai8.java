
package bai8;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai8 
{
    public static class Student implements Comparable <Student>
    {
        private String id, name, Class, email, phone_number;
        private String lec_name, pj_name;
        public Student(String id, String name, String Class,  String phone_number) {
            this.id = id;
            this.name = name;
            this.Class = Class;
            setPhone_number(phone_number);
        }
        public Student(String id, String name, String lec_name, String pj_name, String phone_number)
        {
            this.id = id;
            this.name = name;
            this.lec_name = lec_name;
            this.pj_name = pj_name;
            this.phone_number = phone_number;
        }
        public void setPhone_number(String phone_number) {
            this.phone_number = "0" + phone_number;
        }
        
        @Override
        public int compareTo(Student o)
        {  
            return this.id.compareTo(o.id);
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s %s %s", id, name, lec_name, pj_name, phone_number);
        }
    }
    public static class Lecturer 
    {
        private String name;
        private int quantity;
        private String id_student;
        private String name_pj;

        public Lecturer(String name, int quantity, String id_student, String name_pj) {
            this.name = name;
            this.quantity = quantity;
            this.id_student = id_student;
            this.name_pj = name_pj;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<Student> arl = new ArrayList<>();
        while(sc1.hasNextLine())
        {
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            String Class = sc1.nextLine();
            String email = sc1.nextLine();
            String phone_number = sc1.nextLine();
            arl.add(new Student(id, name, Class, phone_number));
        }
        Collections.sort(arl);
        ArrayList<Student> arl2 = new ArrayList<>();
        int n = sc2.nextInt();
        sc2.nextLine();
        for(int i=1;i<=n;i++)
        {
            String s = sc2.nextLine();
//            System.out.println(s);
            String name = s.substring(0, s.length()-2);
            int quantity = Integer.valueOf(s.charAt(s.length()-1)-'0');
//            System.out.println(name);
//            System.out.println(quantity);
            for(int j=1;j<=quantity;j++)
            {
                String id_stu = sc2.next();
                String name_pj = sc2.nextLine().trim();
                for(Student stu: arl)
                {
                    if(stu.id.equals(id_stu))
                    {
//                        System.out.println("lecture_name:"+name);
//                        System.out.println("project_name:"+name_pj);
                        arl2.add(new Student(stu.id, stu.name, name, name_pj,stu.phone_number ));
                    }
                }
            }
            
        }
        Collections.sort(arl2);
        for(Student s: arl2)
        {
            System.out.println(s);
        }
    }
    
}
