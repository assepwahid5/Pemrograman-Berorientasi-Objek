/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Main1 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println();

        mobil2.displayInfo();
        mobil2.startEngine();

        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
    }
}
