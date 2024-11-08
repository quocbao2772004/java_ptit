
package bai6;
import java.util.*;
import java.io.*;
public class Bai6 
{

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream("C:\\Users\\PC\\Desktop\\B22DCVT050\\thuchanh\\sinhtest\\DATA1.in"));
        ArrayList<String> arl1 = (ArrayList<String>) ios1.readObject();
        ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream("C:\\Users\\PC\\Desktop\\B22DCVT050\\thuchanh\\sinhtest\\DATA2.in"));
        ArrayList<String> arl2 = (ArrayList<String>) ios2.readObject();
        Set<String> set1 = new TreeSet<>(arl1);
        Set<String> set2 = new TreeSet<>(arl2);
        for(String i: set1)
        {
            for(String j: set2)
            {
                System.out.println(i+j);
            }
        }
    }
    
}
