/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Hewan("Mimi", 3);
        Kucing.suara();
        Kucing.info();
        
        Hewan Anjing = new Hewan("Agus", 4);
        Anjing.suara();
        Anjing.berlari();
        Anjing.info();
    }
    
}

