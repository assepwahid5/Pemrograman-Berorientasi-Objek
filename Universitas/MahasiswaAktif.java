/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universitas;

/**
 *
 * @author LENOVO
 */
public class MahasiswaAktif extends Mahasiswa {

    private int semester;

    // Konstruktor memanggil konstruktor superclass
    public MahasiswaAktif(String nama, String nim, double nilai, String fakultas, int semester) {
        super(nama, nim, nilai, fakultas);
        this.semester = semester;
    }

    public void tampilkanDataLengkap() {
        // Mengakses atribut protected dari superclass
        System.out.println("Nilai: " + this.nilai);

        // Mengakses metode protected dari superclass
        System.out.println("Detail Mahasiswa: " + getDetailMahasiswa());

        // Mengakses atribut dan metode public dari superclass
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());

        // Menampilkan atribut tambahan di subclass
        System.out.println("Semester: " + this.semester);
    }
}
