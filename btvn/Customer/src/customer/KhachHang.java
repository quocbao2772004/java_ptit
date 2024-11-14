
package customer;

public class KhachHang 
{
    private String diaChi;
    private int khachHangID;
    private String tenKH;

    public KhachHang(String diaChi, int khachHangID, String tenKH) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getKhachHangID() {
        return khachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }
    
}
