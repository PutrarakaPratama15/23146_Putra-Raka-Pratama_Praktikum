/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1.latihan2;

/**
 *
 * @author RAKA
 */
public class Nilai {
     String NIM, Nama;
     double NilaiAbsen, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;

     public Nilai(String NIM, String Nama, double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
          this.NIM = NIM;
          this.Nama = Nama;
          this.NilaiAbsen = NilaiAbsen;
          this.NilaiTugas = NilaiTugas;
          this.NilaiUTS = NilaiUTS;
          this.NilaiUAS = NilaiUAS;
          this.NilaiAkhir = (NilaiAbsen * 0.1) + (NilaiTugas * 0.2) + (NilaiUTS * 0.3) + (NilaiUAS * 0.4);
     }

     public void CetakNilai() {
          System.out.println("NIM : " + NIM);
          System.out.println("Nama : " + Nama);
          System.out.println("Nilai Absen [10%] : " + NilaiAbsen);
          System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
          System.out.println("Nilai UTS [30%] : " + NilaiUTS);
          System.out.println("Nilai UAS [40%] : " + NilaiUAS);
          System.out.println("Nilai Akhir : " + NilaiAkhir);
     }
}