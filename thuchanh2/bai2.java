import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
public class bai2
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            int [] a = new int[n+1];
            Vector<Integer> v = new Vector<Integer>();
            Vector<Integer> v2 = new Vector<Integer>();
            boolean[] b = new boolean[5000];
            for(int i=1;i<=n;i++)
            {
                a[i]=sc.nextInt();
                if(b[a[i]] == false)
                {
                    if(a[i] % 2 == 0)
                    {
                        v.add(a[i]);
                    }
                    else
                    v2.add(a[i]);
                    b[a[i]] =true;
                }
               
            }
            Collections.sort(v);
            Collections.sort(v2);
            for(int i=0;i<=v.size()-1;i++)
            {
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            for(int i=v2.size()-1;i>=0;i--)
            {
                System.out.print(v2.get(i) + " ");
            }
            System.out.println();
        }
    }
}