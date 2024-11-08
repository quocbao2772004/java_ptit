import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class sinhtest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add the test numbers to the list
        int[] values = {121, 676, 1441, 34543, 907709, 12};
        for (int val : values) {
            numbers.add(val);
        }

        ArrayList<String> obA = new ArrayList<>();
        ArrayList<String> obB = new ArrayList<>();
        String[] abA1 = {"AAAAA","CCCCC", "BBBBB"};
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC\\Desktop\\B22DCVT050\\thuchanh\\sinhtest\\DATA2.in"))) {
            oos.writeObject(obB);
            System.out.println("Test file SONGUYEN.IN has been created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
