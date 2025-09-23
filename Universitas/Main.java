/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universitas;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Andi", "123456", 85.5, "Teknik Informatika");

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("NIM Mahasiswa: " + mhs.getNim());

        mhs.setNama("Budi");
        mhs.setNim("654321");
        System.out.println("Nama Baru: " + mhs.getNama());
        System.out.println("NIM Baru: " + mhs.getNim());

        mhs.tampilkanFakultas();

    }
}
