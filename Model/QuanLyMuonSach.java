/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Thom
 */
public class QuanLyMuonSach implements Serializable{
    private BanDoc banDoc;
    private Sach sach;
    private int soLuong;
    private String tinhTrang;
    
    public QuanLyMuonSach(){
        
    }

    public QuanLyMuonSach(BanDoc banDoc, Sach sach, int soLuong, String tinhTrang) {
        this.banDoc = banDoc;
        this.sach = sach;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public Object[] toObject(){
        return new Object[]{
            banDoc.getMa(), banDoc.getHoTen(),sach.getMa(), sach.getTenSach(), soLuong, tinhTrang
        };
    }
    
}
