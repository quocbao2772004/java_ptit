import java.util.concurrent.PriorityBlockingQueue;
import java.math.BigInteger;
import java.util.*;
public class bai3
{
    public static boolean checkdx(String s)
    {
        int i=0, j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2)
            {
                BigInteger b1 = new BigInteger(s1);
                BigInteger b2 = new BigInteger(s2);
                return b1.compareTo(b2);
            }
        });
        queue.add("44");
        queue.add("55");
        Vector<String> ans = new Vector<>();
        while(true)
        {
            String top = queue.poll();
            // queue.add(top);
            ans.add(top);
            String a = "4" + top + "4";
            String b ="5" + top + "5";
            
            queue.add(a);
            queue.add(b);
            if(ans.size() == 10001)break;
            // queue.add(top);
        }
        
        
        
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
    }
}