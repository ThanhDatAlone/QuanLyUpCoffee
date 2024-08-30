/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class DonViSanPham {
    private String ID_DonviSP;
    private String TenDonvi;
    private int Kichthuoc;
    private int ThemTien;
    
    public DonViSanPham() {
    }

    public DonViSanPham(String ID_DonviSP, String TenDonvi, int Kichthuoc, int ThemTien) {
        this.ID_DonviSP = ID_DonviSP;
        this.TenDonvi = TenDonvi;
        this.Kichthuoc = Kichthuoc;
        this.ThemTien = ThemTien;
    }

    public String getID_DonviSP() {
        return ID_DonviSP;
    }

    public void setID_DonviSP(String ID_DonviSP) {
        this.ID_DonviSP = ID_DonviSP;
    }

    public String getTenDonvi() {
        return TenDonvi;
    }

    public void setTenDonvi(String TenDonvi) {
        this.TenDonvi = TenDonvi;
    }

    public int getKichthuoc() {
        return Kichthuoc;
    }

    public void setKichthuoc(int Kichthuoc) {
        this.Kichthuoc = Kichthuoc;
    }

    public int getThemTien() {
        return ThemTien;
    }

    public void setThemTien(int ThemTien) {
        this.ThemTien = ThemTien;
    }
    
    @Override
    public String toString(){
        return TenDonvi;
    }

    public String getThemTien(String selectByName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
