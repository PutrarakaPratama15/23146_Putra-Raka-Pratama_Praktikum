/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author RAKA
 */
import java.util.Scanner;
public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        // Variabel untuk menyimpan data input
        int jumlahItem;
        String[] kodeInput = new String[10];
        int[] jumlahBeli = new int[10];
        int totalBayar = 0;

        System.out.print("Masukkan Item Barang: ");
        jumlahItem = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeInput[i] = input.nextLine();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
            input.nextLine(); // Mengambil newline yang tersisa
        }

        // Output tampilan 
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*********************************");
        System.out.println("No   Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("===========================================================");

        // Menampilkan data berdasarkan inputan
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    int jumlahBayar = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    System.out.printf("%-5d %-12s %-12s %-7d %-12d %-12d\n", (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar);
                }
            }
        }

        // Menampilkan total bayar
        System.out.println("===========================================================");
        System.out.println("Total Bayar                         " + totalBayar);
        System.out.println("===========================================================");
    }
}
