import java.util.*;
import java.math.BigInteger;
import java.util.*;
public class bai8
{
    public static class Account
    {
        private String username, password;
        public int count;
        public Account(String username, String password)
        {
            this.username = username;
            this.password = password;
        }

    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
       int n = sc.nextInt();
       ArrayList<Account> arl = new ArrayList<Account>();
       for(int i=1;i<=n;i++)
       {
            String usn = sc.next();
            String pwd = sc.next();
            arl.add(new Account(usn, pwd));
       }
       int m = sc.nextInt();
       for(int i=1;i<=m;i++)
       {
            String usn = sc.next();
            String pwd = sc.next();
            for(Account a: arl)
            {
                if(a.username.equals(usn) && a.password.equals(pwd))
                {
                    a.count+=1;
                }
            }
       }
       for(Account a: arl)
       {
        System.out.print(a.count+" ");
       }
    }
}