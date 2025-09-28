/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LENOVO
 */
public class Main1 {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(new Buku("Belajar Java", 50000));
        keranjang.tambahProduk(new Elektronik("Headset", 200000));
        keranjang.tambahProduk(new Pakaian("Kaos", 100000));

        System.out.println("Total harga setelah diskon: " + keranjang.totalHarga());
    }
}
