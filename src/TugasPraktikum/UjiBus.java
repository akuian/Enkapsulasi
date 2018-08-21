/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class UjiBus {
    public static void main(String[] args) {
         Bus Uji = new Bus(12);
        Uji.penumpang = 5;
        Uji.maxPenumpang = 15;
        Uji.cetak();
        
        Uji.penumpang=Uji.penumpang + 5;
        Uji.cetak();
        
        Uji.penumpang = Uji.penumpang - 2;
        Uji.cetak();
        
        Uji.penumpang = Uji.penumpang + 8;
        Uji.cetak();
        Uji.getAverage(0);
    }
}
