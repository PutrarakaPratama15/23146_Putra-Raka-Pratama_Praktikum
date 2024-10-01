/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author RAKA
 */
import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        // Input data mahasiswa
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("NPM: ");
            String npm = input.nextLine();
            System.out.print("Nama Mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Nilai Kehadiran: ");
            double nilaiKehadiran = input.nextDouble();
            System.out.print("Nilai Tugas: ");
            double nilaiTugas = input.nextDouble();
            System.out.print("Nilai UTS: ");
            double nilaiUTS = input.nextDouble();
            System.out.print("Nilai UAS: ");
            double nilaiUAS = input.nextDouble();
            
            // Menghitung nilai akhir
            double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
            
            // Menentukan grade
            char grade;
            String keterangan;
            
            if (nilaiAkhir >= 76) {
                grade = 'A';
                keterangan = "ISTIMEWA";
            } else if (nilaiAkhir >= 66) {
                grade = 'B';
                keterangan = "BAIK";
            } else if (nilaiAkhir >= 56) {
                grade = 'C';
                keterangan = "CUKUP";
            } else if (nilaiAkhir >= 46) {
                grade = 'D';
                keterangan = "KURANG";
            } else {
                grade = 'E';
                keterangan = "KURANG SEKALI";
            }
            
            // Output
            System.out.println("NPM Mahasiswa: " + npm);
            System.out.println("Nama Mahasiswa: " + nama);
            System.out.println("Nilai Rata-rata: " + nilaiAkhir);
            System.out.println("Grade: " + grade);
            System.out.println("Keterangan: " + keterangan);
        }
    }
}
