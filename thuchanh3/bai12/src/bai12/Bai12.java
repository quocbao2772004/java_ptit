
package bai12;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai12 
{
    public static class Student implements Comparable <Student>
    {
        private String id, name, Class, email, phone_number;
        private String lec_name, pj_name;
        public Student(String id, String name,  String phone_number, String email) {
            this.id = id;
            this.name = name;
            this.phone_number = phone_number;
            this.email = email;
        }
        
        @Override
        public int compareTo(Student o)
        {  
            return this.id.compareTo(o.id);
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s %s", id, name, phone_number,email);
        }
    }
    public static class Lecturer 
    {
        private String id, name;
        private String name_pj;
        public Lecturer(String id, String name, String name_pj) 
        {
            this.id = id;
            this.name = name;
            this.name_pj = name_pj;
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s", id, name, name_pj);
        }
        
    }
    public static class HoiDong implements Comparable<HoiDong>
    {
        private String id_hoidong, id_stu, name, name_pj, lec_name;

        public HoiDong(String id_hoidong, String id_stu, String name, String name_pj, String lec_name) {
            this.id_hoidong = id_hoidong;
            this.id_stu = id_stu;
            this.name = name;
            this.name_pj = name_pj;
            this.lec_name = lec_name;
        }
        @Override
        public int compareTo(HoiDong o)
        {
            return this.id_stu.compareTo(o.id_stu);
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s %s", id_stu, name, name_pj, lec_name);
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        ArrayList<Student> arl = new ArrayList<>();
        int n1 = sc1.nextInt();
        sc1.nextLine();
        for(int i=1;i<=n1;i++)
        {
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            String phone_number = sc1.nextLine();
            String email = sc1.nextLine();
            
            arl.add(new Student(id, name, phone_number, email));
        }
//        for(Student i: arl)
//        {
//            System.out.println(i);
//        }
        ArrayList<Lecturer> arl2 = new ArrayList<>();
        int n2 = sc2.nextInt();
        sc2.nextLine();
        for(int i=1;i<=n2;i++)
        {
            String id = String.format("DT%03d", i);
            String name = sc2.nextLine();
            String name_pj = sc2.nextLine();
            arl2.add(new Lecturer(id, name, name_pj));
            
        }
//        for(Lecturer i: arl2)
//        {
//            System.out.println(i);
//        }
        ArrayList<HoiDong> arl3 = new ArrayList<HoiDong>();
        boolean[] check = new boolean[10];
        int n3 = sc3.nextInt();
        for(int i=1;i<=n3;i++)
        {
            String id_stu = sc3.next();
            String id_pj = sc3.next();
            String id_hd = sc3.next();
            String id_hoidong = String.valueOf(id_hd.charAt(id_hd.length()-1)-'0');
            check[Integer.valueOf(id_hoidong)] = true;
            for(Student stu: arl)
            {
                if(stu.id.equals(id_stu))
                {
                    for(Lecturer ltr: arl2)
                    {
                        if(ltr.id.equals(id_pj))
                        {
                            arl3.add(new HoiDong(id_hoidong, id_stu, stu.name, ltr.name_pj, ltr.name));
//                            System.out.println(id_stu + " "+ stu.name+" "+ ltr.name_pj+" "+ ltr.name);
                        }
//                        System.out.println("ltr.id = " + ltr.id);
                    }
                    //break;
                }
            }
//            System.out.println("id_stu " + id_stu);
//            System.out.println("id_pj " + id_pj);
//            System.out.println("id_hd " + id_hd);
//            System.out.println("id_hoidong " + id_hoidong);
            
        }
        Collections.sort(arl3);
        for(int i=1;i<=8;i++)
        {
            if(check[i]==true)
            {
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for(HoiDong j: arl3)
                {
                    if(Integer.valueOf(j.id_hoidong) == i)
                    {
                        System.out.println(j);
                    }
                }
            }
        }
        
    }
    
}
