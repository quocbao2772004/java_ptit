import java.util.*;
import java.math.BigInteger;
import java.util.*;
public class bai6
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[m+1];
        int [] b = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            b[i]=0;
        }
        for(int i = 0; i < m; i++)
        {
            a[i] = sc.nextInt();
            b[a[i]] = 1;
        }
        int count1 = 0, count0 = 1;
        for(int i=1;i<=n;i++)
        {
            if(b[i] == 1)
            {
                count1 +=1;
            }
            else 
            {
                if(count1 !=0 )
                {
                    
                }
            }
            if(b[i])

        }
    }
}