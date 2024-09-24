/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author RAKA
 */
class Balok extends Bentuk {
     
    private final double panjang;
    private final double lebar;     
    private final double tinggi;

    // Konstruktor untuk inisialisasi panjang, lebar, dan tinggi balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungVolume untuk balok
    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi; // Volume balok = panjang * lebar * tinggi
    }

    // Implementasi metode hitungLuasPermukaan untuk balok
    @Override
    double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi); // Luas permukaan balok = 2 * (pl + pt + lt)
    }
}