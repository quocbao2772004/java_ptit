
package customer;


public class MatHangMua 
{
    private HoaDon hd;
    private int matHangMuaID;
    private MatHang md;
    private int soLuong;

    public MatHangMua(HoaDon hd, int matHangMuaID, MatHang md, int soLuong) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.md = md;
        setSoLuong(soLuong);
    }
    public void ThemMatHangMuaCuaHoaDon()
    {
        hd.ThemHoaDon(this);
        
    }
    public float tinhTongTien()
    {
        return soLuong * md.getGia();
    }

    public void setSoLuong(int soLuong) {
        if(soLuong <= md.getSoLuong())
        {
            this.soLuong = soLuong;
            md.setSoLuong(md.getSoLuong() - soLuong);
        }
            
        else
            System.out.println("So luong ban can mua vuot qua so luong hien co");
    }

    public int getSoLuong() {
        return soLuong;
    }

    public MatHang getMd() {
        return md;
    }
}
