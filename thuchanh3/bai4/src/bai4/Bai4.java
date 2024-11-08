
package bai4;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai4 
{

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> arl = (ArrayList<String>) ios1.readObject();
        TreeSet<String> set1 = new TreeSet<>(arl);
        ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arl2 = (ArrayList<Integer>) ios2.readObject();
        TreeSet<Integer> set2 = new TreeSet<>(arl2);
        for(String i: set1)
        {
            for(int j: set2)
            {
                System.out.println(i+String.valueOf(j));
            }
        }
        
                
    }
    
}
