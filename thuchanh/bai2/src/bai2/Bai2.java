
package bai2;

import java.util.*;
import java.io.*;
public class Bai2 
{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> mp = new HashMap<>();
        while(sc.hasNextLine())
        {
            String[] words = sc.nextLine().toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(words[words.length -1]);
            for(int i=0;i<words.length - 1;i++)
            {
                sb.append(words[i].charAt(0));
            }
            mp.put(sb.toString(), mp.getOrDefault(sb.toString(),0)+1);
            if(mp.get(sb.toString()) > 1)
            {
                sb.append(mp.get(sb.toString()));
            }
            sb.append("@ptit.edu.vn");
            System.out.println(sb.toString());
        }
    }
    
}
