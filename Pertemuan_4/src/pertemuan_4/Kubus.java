/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author RAKA
 */
class Kubus extends Bentuk {
    private final double sisi;  // Properti untuk menyimpan panjang sisi kubus

    // Konstruktor untuk inisialisasi sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode hitungVolume untuk kubus
    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3); // Volume kubus = sisi^3
    }

    // Implementasi metode hitungLuasPermukaan untuk kubus
    @Override
    double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2); // Luas permukaan kubus = 6 * sisi^2
    }
}