
package bai6;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai6 
{

    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        ArrayList<BigInteger> arl = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arl.add(sc.nextBigInteger());
        }
        BigInteger min_num = arl.get(0);
        BigInteger max_num = arl.get(0);
        BigInteger sum = BigInteger.ZERO;
        for(BigInteger i: arl)
        {
            if(i.compareTo(min_num)<0)
            {
                min_num = i;
            }
            if(i.compareTo(max_num)>0)
            {
                max_num = i;
            }
            sum = sum.add(i);
        }
        System.out.println(min_num);
        System.out.println(max_num);
        System.out.println(sum);
    }
    
}
