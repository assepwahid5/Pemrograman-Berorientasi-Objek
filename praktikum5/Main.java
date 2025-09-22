/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Objek Hewan
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Doggy");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();

        System.out.println("\n=== Hierarki Kendaraan ===");

        Mobil mobil = new Mobil("Avanza", 120, 4);
        SepedaMotor motor = new SepedaMotor("Vario", 80, "Mesin 150cc");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}
