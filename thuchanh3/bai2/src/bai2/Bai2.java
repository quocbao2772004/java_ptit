
package bai2;

import java.util.*;
import java.io.*;
import java.math.*;


public class Bai2 
{
    public static boolean check(String s)
    {
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9')
                return false;
        }
        return true;
    }
   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arl = (ArrayList<String>) ios1.readObject();
        TreeSet<Integer> tset = new TreeSet<>();
        for(String i: arl)
        {
            String[] set = i.trim().split("\\s+");
            for(String j: set)
            {
                if(!j.equals("")&&j.length()>=1 && j.length()<11&&check(j))
                {
                    tset.add(Integer.valueOf(j));
                }
            }
        }
        for(int i: tset)
        {
            System.out.println(i);
        }
        
                
    }
    
}
