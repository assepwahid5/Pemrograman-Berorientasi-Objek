/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LENOVO
 */
//public class Main {
  //  public static void main(String[] args) {
    //    Hewan kucing = new Kucing();
      //  kucing.bersuara(); // Output: Hewan bersuara
        //kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
       // kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
    //}
//}

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();

        Kucing kucing = new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);

        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3);
    }
}