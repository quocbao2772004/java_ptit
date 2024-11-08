import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sinhtest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add the test numbers to the list
        int[] values = {121, 676, 1441, 34543, 907709, 12, 121, 676,778877};
        for (int val : values) {
            numbers.add(val);
        }

        ArrayList<String> obA = new ArrayList<>();
        ArrayList<String> obB = new ArrayList<>();
        String[] abA1 = {"Java Programming 5 has 371 pages.\n","More than 70 % …"};
        String[] abB1 = {"111", "222","222","000"};
        for(String ab :abA1)
        {
            obA.add(ab);
        }
        for(String ab :abB1)
        {
            obB.add(ab);
        }

        // Write the ArrayList to a binary file named "SONGUYEN.IN"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC\\Desktop\\B22DCVT050\\thuchanh3\\sinhtest\\src\\sinhtest\\DATA.in"))) {
            oos.writeObject(obA);
            System.out.println("Test file SONGUYEN.IN has been created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
