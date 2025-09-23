/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universitas;

/**
 *
 * @author LENOVO
 */
public class Main1 {
    public static void main(String[] args) {

        // Membuat objek mahasiswa biasa
        Mahasiswa mhs = new Mahasiswa("Andi", "123456", 85.5, "Teknik Informatika");

        System.out.println("=== Objek Mahasiswa ===");
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("NIM Mahasiswa: " + mhs.getNim());
        mhs.tampilkanFakultas();

        // Membuat objek mahasiswa aktif (subclass)
        MahasiswaAktif mhsAktif = new MahasiswaAktif("Citra", "789012", 90.0, "Sistem Informasi", 4);

        System.out.println("\n=== Objek Mahasiswa Aktif (Subclass) ===");
        mhsAktif.tampilkanDataLengkap();
    }
}