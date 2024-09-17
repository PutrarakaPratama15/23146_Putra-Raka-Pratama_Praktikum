/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author RAKA
 */
// Class MatematikaInheritance
class MatematikaAksi {
    public static void main(String[] args) {
        Matematika2 matematika = new Matematika2();
        int hasilTambah = matematika.tambah(10, 5);
        int hasilModulus = matematika.modulus(10, 3);

        System.out.println("Hasil Tambah: " + hasilTambah);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
}