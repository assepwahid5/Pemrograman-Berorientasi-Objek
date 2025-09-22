/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    public void suara() {
        System.out.println("Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Meong!");
    }
}
