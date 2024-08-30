/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author sonlu
 */
public class ThongKeSPBan {
    private String Tensp;
    private int soluong;

    public ThongKeSPBan() {
    }

    public ThongKeSPBan(String Tensp, int soluong) {
        this.Tensp = Tensp;
        this.soluong = soluong;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
