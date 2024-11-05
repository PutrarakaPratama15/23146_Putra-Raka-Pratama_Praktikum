/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9.Latihan2;

/**
 *
 * @author Lenovo
 */
public class HitungHari {
    private int tahun;
    private int bulan;

    public HitungHari(int tahun, int bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    }

    public String hitung() {
        int jumlahHari;
        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jumlahHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                // Logika untuk tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                jumlahHari = 0;
                break;
        }
        return String.valueOf(jumlahHari);
    }
}
