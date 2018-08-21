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
public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
    public Bus(double maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang=0;
    }
     public void addpenumpang (double penumpang)
    {
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
     public void getpenumpang(int password)
    {
        if (password==24) {
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
        }
    }
    public void getAverage(double counter){
        double ratarata;
        ratarata=maxPenumpang/counter;
        System.out.println("Rata-rata penumpang adalah = "+ratarata);
    }
    public void cetak(){
        System.out.println("Maksimal berat penumpang = " +maxPenumpang);
        System.out.println("Jumlah berat Penumpang = " +penumpang);
    }
    //
}
    
