import java.util.*;
import java.math.BigInteger;
import java.util.*;
public class bai7
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
       String s = sc.next();
       int n=s.length();
       ArrayList<Integer> arl = new ArrayList<>();
       boolean[] b = new boolean[100];
       if(s.length()%2!=0)
       {
            n--;
       }
       for(int i=0;i<n;i+=2)
       {
            String x ="";
            x = x + s.charAt(i) + s.charAt(i+1);
            if(b[Integer.valueOf(x)] == false)
            {
                arl.add(Integer.valueOf(x));
                b[Integer.valueOf(x)] = true;
            }
            
            // System.out.println(s.charAt(i) );
       }
       Collections.sort(arl);
       for(int i: arl)
       {
        System.out.print(i+" ");
       }
    }
}