
package bai3;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai3 
{

    public static boolean check(int n)
    {
        String s = String.valueOf(n);
        if(s.length()<3) return false;
        int i=0, j = s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arl = (ArrayList<Integer>) ios.readObject();
        TreeSet<Integer> set1 = new TreeSet<>(arl);
        for(int i: set1)
        {
            if(check(i)==true)
            {
                System.out.println(i);
            }
        }
        
                
    }
    
}
