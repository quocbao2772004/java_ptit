
package bai1;
import java.util.*;
import java.io.*;
import java.math.*;
public class Bai1 
{

   
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        Set<BigInteger> set1 = new HashSet<>();
        while(sc.hasNextBigInteger())
        {
            set1.add(sc.nextBigInteger());
        }
        BigInteger sum = BigInteger.ZERO;
        BigInteger tich = BigInteger.ONE;
        for(BigInteger i: set1)
        {
//            System.out.println(i);
            sum = sum.add(i);
            tich = tich.multiply(i);
        }
        System.out.println(sum);
        System.out.println(tich);
    }
    
}
