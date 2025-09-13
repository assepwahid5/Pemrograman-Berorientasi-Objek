/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Main2 {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Programmer", 8000000);

        //System.out.println("Informasi pekerja:");
        //System.out.println(pekerja1.toString());

        //pekerja1.setNama("Andi");
        //System.out.println("\nSetelah ubah nama:");
        //System.out.println(pekerja1.toString());
        
        System.out.println("Nama: " + pekerja1.nama);   
        System.out.println("Usia: " + pekerja1.usia);   
        System.out.println("Gaji: " + pekerja1.gaji);
    }
}

