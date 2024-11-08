
package bai4;

import java.util.*;
import java.io.*;
import java.math.*;
public class Bai4 
{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("test.txt"));
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for(int i=1;i<=n;i++)
        {
            set1.add(sc.nextInt());
        }
        for(int j=1;j<=m;j++)
        {
            set2.add(sc.nextInt());
        }
        Set<Integer> set3 = new TreeSet<>(set1);
        Set<Integer> set4 = new TreeSet<>(set1);
        Set<Integer> set5 = new TreeSet<>(set2);
        set3.retainAll(set2);
        for(int i: set3)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        set4.removeAll(set2);
        for(int i: set4)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        set5.removeAll(set1);
        for(int i: set5)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        
    }
    
}
