
package employee;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new PartTimeEmployee("Nguyen Van A", 30000, 4);
        Employee employee2 = new FullTimeEmployee("Nguyen Van B", 35000);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
