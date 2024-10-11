import java.util.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class bai15
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        int n = sc.nextInt();
        int [][]a = new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a[i][j]==1 && i<=j)
                {
                    System.out.printf("(%d,%d)\n", i,j);
                }
            }
        }
    }
}