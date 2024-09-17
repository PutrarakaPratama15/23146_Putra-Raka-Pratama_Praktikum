/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1;

/**
 *
 * @author RAKA
 */
// Class Matematika
class Matematika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan nol");
        }
        return a / b;
    }
}