
package customer;
import java.util.*;
public class Main 
{

    
    public static void main(String[] args) 
    {
        KhachHang k1 = new KhachHang("My Dinh", 1001, "Nguyen Van A");
        ArrayList<MatHang> KhoHang = new ArrayList<>();
        MatHang x = new MatHang((float) 13.5, 111433, 10, "X");
        MatHang y = new MatHang((float) 17.8, 111655, 20, "Y");
        MatHang z = new MatHang((float) 26.7, 124245, 24, "Z");
        KhoHang.add(x);
        KhoHang.add(y);
        KhoHang.add(z);
        HoaDon HoaDonCuaKhachA = new HoaDon(1001, k1, "3/11/2024", (float) 0.0);
        MatHangMua sp1 = new MatHangMua(HoaDonCuaKhachA, 111433, x, 5);
        MatHangMua sp2 = new MatHangMua(HoaDonCuaKhachA, 111655, y, 6);
        HoaDonCuaKhachA.ThemHoaDon(sp1);
        HoaDonCuaKhachA.ThemHoaDon(sp2);
        HoaDonCuaKhachA.InHoaDon();
//        System.out.printf("San pham x con lai %d san pham\n", x.getSoLuong());
    }
    
}
