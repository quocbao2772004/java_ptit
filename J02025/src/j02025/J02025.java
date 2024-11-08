package j02025;
import java.util.*;
import java.io.*;
public class J02025 
{
    public static int [] x = new int [20];
    public static ArrayList<String> arl = new ArrayList<>();
    public static boolean is_prime(int n)
    {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
            {
                return false;
            }
        return true;
    }
    public static void solve(int[] x, int n, Integer[] a)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(x[i] == 1)
            {
                sum = sum + a[i];
            }
        }
        if(is_prime(sum))
        {
            String s = "";
            for(int i=1;i<=n;i++)
                if(x[i]==1)
            {
                s = s + String.valueOf(a[i]) + " ";
            }
            arl.add(s);
        }
    }
    public static void Try(int i, int n, Integer[] a)
    {
        for(int j=0;j<=1;j++)
        {
            x[i]=j;
            if(i==n)
            {
                solve(x,n,a);
            }
            else
            {
                Try(i+1,n, a);
            }
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File("F:/code visual studio/java_ptit/file.txt"));
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            Integer[] a = new Integer[n+1];
            for(int i=1;i<=n;i++) a[i] = sc.nextInt();
            Arrays.sort(a,1,n+1, Collections.reverseOrder());
//            for(int i=1;i<=n;i++)
//            {
//                System.out.print(a[i]+" ");
//            }
//            System.out.println("");
            Try(1,n,a);
//            Collections.sort(arl);
            for(String i: arl)
            {
                System.out.println(i);
            }
            arl.clear();
        }
    }
    
}