import java.util.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class bai12
{
    public static class Solve implements Comparable<Solve>
    {
        private String id, theloai, date, number, sotap;
        public Solve(String id, String theloai, String date, String number, String sotap)
        {
            this.id = id;
            this.theloai = theloai;
            this.date = date;
            this.number = number;
            this.sotap = sotap;
        }
        
        @Override
        public int compareTo(Solve o)
        {
            String[] set1 = o.date.split("/");
            String[] set2 = this.date.split("/");
            if(set2[2].equals(set1[2]))
            {
                if(set2[1].equals(set1[1]))
                {
                    if(set2[0].equals(set1[0]))
                    {
                        if(o.number.equals(this.number))
                        {
                            return Integer.compare(Integer.valueOf(o.sotap), Integer.valueOf(this.sotap));
                        }
                        return this.number.compareTo(o.number);
                    }
                    else 
                    return Integer.compare(Integer.valueOf(set2[0]), Integer.valueOf(set1[0]));
                }
                else 
                    return Integer.compare(Integer.valueOf(set2[1]), Integer.valueOf(set1[1]));
            }
            else 
                    return Integer.compare(Integer.valueOf(set2[2]), Integer.valueOf(set1[2]));
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %s %s %s", this.id, this. theloai, this.date, this.number, this.sotap);
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String, String> mp = new LinkedHashMap<String, String>();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            String tl="TL";
            String index = String.valueOf(i);
            while(index.length()<3)
            {
                index = "0" + index;
            }
            mp.put(tl+index, sc.nextLine());
        }
        ArrayList<Solve> arl = new ArrayList<Solve>();
        for(int i=1;i<=m;i++)
        {
            String id="P";
            String index = String.valueOf(i);
            while(index.length()<3)
            {
                index = "0" + index;
            }
            id = id+index;
            String theloai = sc.nextLine();
            String ngay=sc.nextLine();
            String ten = sc.nextLine();
            String tap = sc.nextLine();
            arl.add(new Solve(id, mp.get(theloai), ngay, ten, tap));
        }
        Collections.sort(arl);
        for(Solve s: arl)
        {
            System.out.println(s);
        }
       
    }
}