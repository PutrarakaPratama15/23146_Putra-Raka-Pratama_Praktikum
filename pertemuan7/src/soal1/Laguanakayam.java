/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author RAKA
 */
public class Laguanakayam {
    public static void main(String[] args) {
            int n = 4;
            
            //menampilkan lirik anak ayam
            while (n > 1) {
                System.out.println("Tek kotek, kotek kotek");
                System.out.println("Anak ayam turunlah berkotek");
                System.out.println("Anak ayam turunlah " + n);
                n--; //method untuk mengurangi anak ayam
                System.out.println("Mati satu tinggallah " + n);
                System.out.println();
            }
            
            //method untuk menampilkan lirik jika anak ayam sudah mati semua
            System.out.println("Anak ayam turunlah satu");
            System.out.println("Mati satu tinggallah induknya.");
        }
    }

