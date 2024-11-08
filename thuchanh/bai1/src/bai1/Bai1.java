package bai1;
import java.io.*;
import java.util.*;
public class Bai1 
{

    public static boolean check(int n)
    {
        String s = String.valueOf(n);
        if(s.length()<3) return false;
        int i=0, j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));

        ArrayList<Integer> arl = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> s = new TreeSet<Integer>();
        for(int i: arl)
        {
            if(check(i)==true)
                s.add(i);
        }
        for(int i: s)
        {
            System.out.println(i);
        }
    }
    
}
