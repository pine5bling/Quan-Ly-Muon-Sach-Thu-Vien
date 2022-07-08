/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Thom
 */
public class BanDoc implements Serializable{
   // mã bạn đọc, Họ tên, địa chỉ, Số ĐT
    private int ma;
    private String hoTen, diaChi, soDienThoai;
    private static int sma=10000;
    
    public BanDoc(){
        
    }

    public BanDoc(int ma, String hoTen, String diaChi, String soDienThoai) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, hoTen, diaChi, soDienThoai
        };
    }

    
}
