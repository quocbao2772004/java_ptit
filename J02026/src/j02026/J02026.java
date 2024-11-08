package j02026;
import java.util.*;
import java.io.*;
public class J02026 
{
    public static int [] x = new int [20];
    public static void Try(int i, int s, int n, int k, Integer[] a)
    {
        for(int j=s;j<=n;j++)
        {
            x[i] = j;
            if(i == k)
            {
                for(int v = 1; v <= k;v++)
                {
                    System.out.print(a[x[v]]+" ");
                }
                System.out.println("");
            }
            else Try(i+1, j+1, n, k, a);
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        int test = sc.nextInt();
        while(test -- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] a = new Integer[n+1];
            for(int i=1;i<=n;i++)a[i]=sc.nextInt();
            Arrays.sort(a,1,n+1);
            Try(1, 1, n, k, a);
        }
    }    
}