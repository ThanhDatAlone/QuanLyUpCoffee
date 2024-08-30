
package Model;

public class HoaDonChiTiet {

    private int ID_Hoadon;
    private String ID_SanPHam;
    private int Soluong;
    private int gia;
    private int tongGia;
    private boolean trangThai;
    private String lyDoHuy;
    private String ghiChu;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int ID_Hoadon, String ID_SanPHam, int Soluong, int gia, int tongGia, boolean trangThai, String lyDoHuy, String ghiChu) {
        this.ID_Hoadon = ID_Hoadon;
        this.ID_SanPHam = ID_SanPHam;
        this.Soluong = Soluong;
        this.gia = gia;
        this.tongGia = tongGia;
        this.trangThai = trangThai;
        this.lyDoHuy = lyDoHuy;
        this.ghiChu = ghiChu;
    }

    public int getID_Hoadon() {
        return ID_Hoadon;
    }

    public void setID_Hoadon(int ID_Hoadon) {
        this.ID_Hoadon = ID_Hoadon;
    }

    public String getID_SanPHam() {
        return ID_SanPHam;
    }

    public void setID_SanPHam(String ID_SanPHam) {
        this.ID_SanPHam = ID_SanPHam;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getTongGia() {
        return tongGia;
    }

    public void setTongGia(int tongGia) {
        this.tongGia = tongGia;
    }

    public String getLyDoHuy() {
        return lyDoHuy;
    }

    public void setLyDoHuy(String lyDoHuy) {
        this.lyDoHuy = lyDoHuy;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
