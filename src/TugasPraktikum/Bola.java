/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.lang.Math;
/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class Bola {
    private double jari=14;
    private double diameter;
    private double luas;
    private double volume;
    
    public void setJari(double jari){
        this.jari=jari;
    }
    public void showDiameter(){
        this.diameter=2*jari;
    }
    public void showLuas(){
        this.luas=4*Math.PI*jari*jari;
    }
    public void showVolume(){
        this.volume=(4*Math.PI*jari*jari*jari)/3;
    }
    public void cetak(){
   System.out.println("Jari-jari : "+jari+ " cm   ");
   System.out.println("______________________________ ");
   System.out.println("Diameter  : "+diameter+ " cm   ");
   System.out.println("Luas      : "+luas+" cm kuadrat");
   System.out.println("Volume    : "+volume+" cm kubik");
   }
}
