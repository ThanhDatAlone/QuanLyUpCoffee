/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class LoaiSanPham {
        private String ID_LoaiSP;
        private String TenLoai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String ID_LoaiSP, String TenLoai) {
        this.ID_LoaiSP = ID_LoaiSP;
        this.TenLoai = TenLoai;
    }

    public String getID_LoaiSP() {
        return ID_LoaiSP;
    }

    public void setID_LoaiSP(String ID_LoaiSP) {
        this.ID_LoaiSP = ID_LoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
        @Override
        public String toString(){
            return TenLoai;
        }
}
