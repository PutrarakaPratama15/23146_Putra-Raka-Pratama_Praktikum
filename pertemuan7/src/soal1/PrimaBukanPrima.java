/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author RAKA
 */
public class PrimaBukanPrima {
    public static void main(String[] args) {
        //method menghitung bilangan prima
        System.out.println("bilangan prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        //method menghitung bilangan bukan prima
        System.out.println("\nbilangan bukan prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //method untuk mengecek bilangan prima
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
