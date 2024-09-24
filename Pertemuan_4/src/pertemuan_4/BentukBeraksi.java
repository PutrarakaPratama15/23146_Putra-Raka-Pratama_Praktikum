/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author RAKA
 */
public class BentukBeraksi {
    public static void main(String[] args) {
        // Membuat objek kubus dengan sisi 4
        Bentuk kubus = new Kubus(8);
        
        // Menghitung dan mencetak volume serta luas permukaan kubus
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        // Membuat objek balok dengan panjang 4, lebar 5, dan tinggi 6
        Bentuk balok = new Balok(3, 6, 8);
        
        // Menghitung dan mencetak volume serta luas permukaan balok
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
    }
}