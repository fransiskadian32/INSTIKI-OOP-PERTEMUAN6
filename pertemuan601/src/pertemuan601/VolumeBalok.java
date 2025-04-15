/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author Dian Matung
 */
public class VolumeBalok {
 private int panjang;
private int lebar;
private int tinggi;
private int hasil;

public int volum(){
    this.hasil = this.panjang*this.lebar*this.tinggi;
    return this. hasil ;
}
public void setPanjang(int pj) {
    this.panjang = pj;
    
}
public void setLebar(int lb) {
    this.panjang = lb;  
}
public void setTinggi(int tg) {
    this.tinggi = tg;  
}
public int getpanjang(){
    return this.panjang;
}
public int getlebar(){
    return this.lebar;
}
public int gettinggi(){
    return this.tinggi;
}
}
