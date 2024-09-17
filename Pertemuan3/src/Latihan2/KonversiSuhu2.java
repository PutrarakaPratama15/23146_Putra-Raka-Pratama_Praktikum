/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author RAKA
 */
// Class KonversiSuhu2 yang menginherit dari KonversiSuhu
class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double f) {
        return (f - 32) * 4/9;
    }
}