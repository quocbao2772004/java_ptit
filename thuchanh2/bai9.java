import java.util.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class bai9
{
    public static boolean check(String s)
    {
        char c = s.charAt(0);
        for(int i=1;i<=s.length()-1;i++)
        {
            if(c > s.charAt(i))
            {
                return false;
            }
            c= s.charAt(i);
        }
        return true;
    }
    public static class Solve implements Comparable<Solve>
    {
        private String number;
        private int count;
        public Solve(String number, int count)
        {
            this.number = number;
            this.count = count;
        }
        @Override
        public int compareTo(Solve o)
        {
            int ans =  Integer.compare(o.count, this.count);
            if(ans ==0) return 0;
            return ans;
        }
        @Override
        public String toString()
        {
            return String.format("%s %d", this.number, this.count);
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
       while(sc.hasNextLine())
       {
            String s = sc.nextLine();
            String[] set = s.trim().split("\\s+");
            for(String i: set)
                if(check(i) == true)
                {
                    map.put(i, map.getOrDefault(i, 0)+1);
                }
       }
       ArrayList<Solve> arl = new ArrayList<>();

       for(String key: map.keySet())
       {
            arl.add(new Solve(key, map.get(key)));
       }
       Collections.sort(arl);
       for(Solve s: arl)
       {
            System.out.println(s);
       }
       
    }
}