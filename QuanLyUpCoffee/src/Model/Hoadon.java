package Model;

import java.util.Date;

public class Hoadon {

    private int idHoaDon;
    private String idNhanVien;
    private Date ngayTao;
    private boolean trangThai;
    private boolean trangThaiTT;
    private int thanhTien;
    private String lyDoHuy;
    private int slSanPhamHuy;
    private String ghiChu;
    private String SDT;
    private String ten;
    private String diaChi;
    private int tienShip;

    public Hoadon() {
    }

    public Hoadon(int idHoaDon, String idNhanVien, Date ngayTao, boolean trangThai, boolean trangThaiTT, int thanhTien, String lyDoHuy, int slSanPhamHuy, String ghiChu, String SDT, String ten, String diaChi, int tienShip) {
        this.idHoaDon = idHoaDon;
        this.idNhanVien = idNhanVien;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.trangThaiTT = trangThaiTT;
        this.thanhTien = thanhTien;
        this.lyDoHuy = lyDoHuy;
        this.slSanPhamHuy = slSanPhamHuy;
        this.ghiChu = ghiChu;
        this.SDT = SDT;
        this.ten = ten;
        this.diaChi = diaChi;
        this.tienShip = tienShip;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isTrangThaiTT() {
        return trangThaiTT;
    }

    public void setTrangThaiTT(boolean trangThaiTT) {
        this.trangThaiTT = trangThaiTT;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getLyDoHuy() {
        return lyDoHuy;
    }

    public void setLyDoHuy(String lyDoHuy) {
        this.lyDoHuy = lyDoHuy;
    }

    public int getSlSanPhamHuy() {
        return slSanPhamHuy;
    }

    public void setSlSanPhamHuy(int slSanPhamHuy) {
        this.slSanPhamHuy = slSanPhamHuy;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTienShip() {
        return tienShip;
    }

    public void setTienShip(int tienShip) {
        this.tienShip = tienShip;
    }

}
