import java.util.*;
import java.io.*;
public class J01002 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            long n = sc.nextInt();
            System.out.println(n*(n+1)/2);
            test-=1;
        }
    }
}
