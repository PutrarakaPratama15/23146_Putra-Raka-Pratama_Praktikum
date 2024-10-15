/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author RAKA
 */
public class GanjilGenap {
    public static void main(String[] args) {
        //method menghitung bilangan genap
        System.out.println("bilangan genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //method menghitung bilangan ganjil
        System.out.println("\nbilangan ganjil dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
