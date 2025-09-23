/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    private String Merk;
    private String Model;
    private int Tahun;
    private String Warna;  
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.Merk = merk;
        this.Model = model;
        this.Tahun = tahun;
        this.Warna = warna;
    }
    
    public String getMerk() {
        return Merk;
    }

    public void setMerk(String merk) {
        this.Merk = merk;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int tahun) {
        this.Tahun = tahun;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }
    
    public void ubahWarna(String warnaBaru) {
    this.Warna = warnaBaru;
    System.out.println("Warna mobil diubah menjadi " + Warna);
    }

    public void displayInfo() {
        System.out.println("Merk Mobil : " + " "+ Merk);
        System.out.println("Model Mobil : " + " "+ Model);
        System.out.println("Tahun Mobil : " + " "+ Tahun);
        System.out.println("Warna Mobil : " + " "+ Warna);
    }
    
    public void startEngine() {
        System.out.println("Mesin mobil " + Merk + " menyala");
    }
}
