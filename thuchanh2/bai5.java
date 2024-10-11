import java.util.*;
import java.math.BigInteger;
import java.util.*;
public class bai5
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        double [] a = new double[n+1];
        double ma = -1.0;
        double mi = 11.0;
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextDouble();
            ma = Math.max(ma,a[i]);
            mi = Math.min(mi,a[i]);
        }
        double sum=0;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(a[i] != ma && a[i] != mi)
            {
                sum = sum +a[i];
                count+=1;
            }
        }
        System.out.printf("%.2f",sum/count);

    }
}