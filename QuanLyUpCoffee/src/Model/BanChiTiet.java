/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class BanChiTiet {
    private int ID_HoaDon;
    private int ID_Ban;
    private Date thoidiemCoNguoi;
    private boolean banChinh;
    
    public BanChiTiet() {
    }

    public BanChiTiet(int ID_HoaDon, int ID_Ban, Date thoidiemCoNguoi, boolean banChinh) {
        this.ID_HoaDon = ID_HoaDon;
        this.ID_Ban = ID_Ban;
        this.thoidiemCoNguoi = thoidiemCoNguoi;
        this.banChinh = banChinh;
    }

    

    public int getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(int ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public int getID_Ban() {
        return ID_Ban;
    }

    public void setID_Ban(int ID_Ban) {
        this.ID_Ban = ID_Ban;
    }

    public Date getThoidiemCoNguoi() {
        return thoidiemCoNguoi;
    }

    public void setThoidiemCoNguoi(Date thoidiemCoNguoi) {
        this.thoidiemCoNguoi = thoidiemCoNguoi;
    }

    public boolean isBanChinh() {
        return banChinh;
    }

    public void setBanChinh(boolean banChinh) {
        this.banChinh = banChinh;
    }
    
    
}
