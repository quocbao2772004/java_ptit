//2
//3 2
//2 100000
//1.154701 1.632993
//70710.678119
import java.util.Scanner;
public class J01005 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            test-=1;
            Double n = sc.nextDouble();
            Double h = sc.nextDouble();
            Double area = (h/2);
            Double each_area = (area/n);
            Double one_of_x2 = each_area*2/h;
//            System.out.println(one_of_x2);
            for(int k=1;k<=n-1;k++)
            {
                System.out.printf("%.6f ",h/Math.sqrt(1/(one_of_x2*k)));
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
