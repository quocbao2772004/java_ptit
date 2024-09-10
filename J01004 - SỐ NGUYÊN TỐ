import java.util.*;
import java.io.*;

public class J01004 {
    public static int is_prime(int n)
    {
        if(n<2)
        {
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n % i == 0)return 0;
        return 1;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            int n = sc.nextInt();
            if(is_prime(n)==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            test-=1;
        }
    }
}
