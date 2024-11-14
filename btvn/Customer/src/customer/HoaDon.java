
package customer;

import java.util.*;

public class HoaDon 
{
    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> arl  = new ArrayList<>();
    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan, float tongTien) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }
    
    public void InHoaDon()
    {
        System.out.println("ID Hoa Don: " + hoaDonID);
        System.out.println("Ten khach hang: " + this.kh.getTenKH());
        System.out.println("ID khach hang: " + this.kh.getKhachHangID());
        System.out.println("Dia chi khach hang: " + this.kh.getDiaChi());
        System.out.println("Ngay ban: " + ngayBan);
        for(MatHangMua i: arl)
        {
            System.out.println("- ID Mat Hang Mua: " + i.getMd().getMatHangID());
            System.out.println(" Ten Mat Hang: " + i.getMd().getTenMatHang() + " * " + i.getSoLuong() + " = " + i.tinhTongTien());  
        }
        System.out.println("Tong tien: " + tongTien);
    }
    public void ThemHoaDon(MatHangMua matHangMua)
    {
        arl.add(matHangMua);
        this.tongTien = this.tongTien + matHangMua.tinhTongTien();
    }
}
