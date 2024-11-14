
package customer;

public class MatHang 
{
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;

    public MatHang(float gia, int matHangID, int soLuong, String tenMatHang) {
        this.gia = gia;
        this.matHangID = matHangID;
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
    }
    public void ThemMatHangVaoKho(int soLuong)
    {
        this.soLuong += soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public int getMatHangID() {
        return matHangID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }
}
