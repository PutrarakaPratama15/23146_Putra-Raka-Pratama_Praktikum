/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author RAKA
 */
public class TabelPerkalian {
    public static void main(String[] args) {
        
        int n =10;

            //method menampilkan hasil perkalian
            System.out.println("Tabel perkalian " + n + "x" + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();//method untuk pindah baris setelah n x 10 
            }
        }
    }

