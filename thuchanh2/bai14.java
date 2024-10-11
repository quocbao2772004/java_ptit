import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class bai14
{
    public static class WordSet
    {
        private Set<String> w;
        public WordSet()
        {
            this.w = new HashSet<>();
        }
        public WordSet(String line)
        {
            this.w = new HashSet<>();
            String[] words = line.toLowerCase().trim().split("\\s+");
            this.w.addAll(Arrays.asList(words));
        }
        public WordSet union(WordSet o)
        {
            WordSet res = new WordSet();
            res.w.addAll(this.w);
            res.w.addAll(o.w);
            return res;
        }
        public WordSet intersection(WordSet o)
        {
            WordSet res = new WordSet();
            res.w.addAll(this.w);
            res.w.retainAll(o.w);
            return res;
        }
        @Override 
        public String toString()
        {
            List<String> stw = new ArrayList<>(this.w);
            Collections.sort(stw);
            return String.join(" ", stw);
        }
    }
    public static Scanner in = new Scanner(System.in);
   public static void main(String[] args) throws FileNotFoundException
    {
        // Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}