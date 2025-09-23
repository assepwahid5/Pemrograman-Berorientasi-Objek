/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universitas;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {

    private String nama;
    private String nim;

    protected double nilai;

    String fakultas;

    public Mahasiswa(String nama, String nim, double nilai, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.fakultas = fakultas;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nimBaru) {
        this.nim = nimBaru;
    }

    protected String getDetailMahasiswa() {
        return "Nama: " + this.nama + ", NIM: " + this.nim;
    }

    void tampilkanFakultas() {
        System.out.println("Fakultas: " + this.fakultas);
    }
}
