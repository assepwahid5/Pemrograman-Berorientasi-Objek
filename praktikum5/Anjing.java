/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    public void suara() {
        System.out.println("Guk guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Guk guk!");
    }
}
