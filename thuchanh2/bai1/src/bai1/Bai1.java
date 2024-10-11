package bai1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Bai1 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
//        Scanner sc = new Scanner(new File('F:/code visual studio/java/thuchanh2/bai1/src/bai1/file.txt'));
        
        int test = sc.nextInt();
        while(test --> 0)
        {
            String s = sc.next();
            int ma = -1;
            int mi = 10;
            for(int i=0;i<=s.length()-1;i++)
            {
                ma=Math.max(ma, s.charAt(i)-'0');
                mi = Math.min(mi, s.charAt(i) - '0');
            }
            System.out.println(ma+" "+mi);
            
        }
    }
    
}
