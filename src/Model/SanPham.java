/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String id_sp;
    private String ten_sp;
    private int gia_sp;
    private String id_donviSP;
    private String id_loaiSP;
    private boolean Trangthai;
    private String hinh;
    public SanPham(){
        
    }

    public SanPham(String id_sp, String ten_sp, int gia_sp, String id_donviSP, String id_loaiSP, boolean Trangthai, String hinh) {
        this.id_sp = id_sp;
        this.ten_sp = ten_sp;
        this.gia_sp = gia_sp;
        this.id_donviSP = id_donviSP;
        this.id_loaiSP = id_loaiSP;
        this.Trangthai = Trangthai;
        this.hinh = hinh;
    }

    public String getId_sp() {
        return id_sp;
    }

    public void setId_sp(String id_sp) {
        this.id_sp = id_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public int getGia_sp() {
        return gia_sp;
    }

    public void setGia_sp(int gia_sp) {
        this.gia_sp = gia_sp;
    }

    public String getId_donviSP() {
        return id_donviSP;
    }

    public void setId_donviSP(String id_donviSP) {
        this.id_donviSP = id_donviSP;
    }

    public String getId_loaiSP() {
        return id_loaiSP;
    }

    public void setId_loaiSP(String id_loaiSP) {
        this.id_loaiSP = id_loaiSP;
    }

    public boolean isTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(boolean Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    @Override
    public String toString(){
        return ten_sp;
    }
}
