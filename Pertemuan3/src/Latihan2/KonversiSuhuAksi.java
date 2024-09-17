/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author RAKA
 */
class KonversiSuhuAksi {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double celsius = 25;
        double fahrenheit = konversi.celciusToFahrenheit(celsius);
        double reamur1 = konversi.celciusToReamur(celsius);
        double reamur2 = konversi2.fahrenheitToReamur(fahrenheit);

        System.out.println("Celsius ke Fahrenheit: " + fahrenheit);
        System.out.println("Celsius ke Reamur: " + reamur1);
        System.out.println("Fahrenheit ke Reamur: " + reamur2);
    }
}