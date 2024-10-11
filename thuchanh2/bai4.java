import java.util.*;
import java.math.BigInteger;
import java.util.*;
public class bai4
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        ArrayList<BigInteger> arl = new ArrayList<BigInteger>();
        for (int k = 0; k < n; k++)
        {
            String s = sc.next();
            String x="";
            
            for(int i=0;i<=s.length()-1;i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    x=x+s.charAt(i);
                }
                else
                {
                    if(x.length()>0)
                    {
                        arl.add(new BigInteger(x));
                        x="";
                    }
                }
            }
            if(x.length()>0)
            {
                arl.add(new BigInteger(x));
            }
        }
        Collections.sort(arl);
        for(BigInteger i: arl)
        {
            System.out.println(i);
        }
    }
}