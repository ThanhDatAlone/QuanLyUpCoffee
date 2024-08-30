/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.Date;

/**
 *
 * @author sonlu
 */
public class ThongKeDonBan {

    private Date NgayDangKy;
    private int soluong;

    public ThongKeDonBan() {
    }

    public ThongKeDonBan(Date NgayDangKy, int soluong) {
        this.NgayDangKy = NgayDangKy;
        this.soluong = soluong;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
