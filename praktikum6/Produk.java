/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LENOVO
 */
public abstract class Produk {
    private String nama;
    private double harga ;
    
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public abstract double hitungDiskon();
    
    public double hargaSetelahDiskon(){
        return harga - hitungDiskon();
    }
}
