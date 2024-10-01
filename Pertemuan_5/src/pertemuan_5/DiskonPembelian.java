/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author RAKA
 */
import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        // Input total pembelian
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Total pembelian (Rp): ");
            double totalPembelian = input.nextDouble();
            
            // Menghitung diskon
            double diskon;
            if (totalPembelian < 50000) {
                diskon = 0.05 * totalPembelian;
            } else {
                diskon = 0.2 * totalPembelian;
            }
            
            // Menghitung total yang harus dibayar
            double totalBayar = totalPembelian - diskon;
            
            // Output
            System.out.println("Total pembelian: Rp " + totalPembelian);
            System.out.println("Besar diskon: Rp " + diskon);
            System.out.println("Jumlah yang harus dibayar: Rp " + totalBayar);
        }
    }
}
