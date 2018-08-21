/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiodataKeluarga;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class HafiyyanFaza {
    private String namaAyah,namaIbu,namaSendiri,namaSaudara;
    private String hobi;
    private String alamat;
    private String cita;
    private int umur;
    
    private String getNamaAyah(){
    return namaAyah;
}
    private String getNamaIbu(){
    return namaIbu;
}
    private String getNamaSendiri(){
    return namaSendiri; 
}
    private String getNamaSaudara(){
    return namaSaudara;
}
    private String getAlamat(){
        return alamat;
    }
    
    private String getHobi(){
        return hobi;
    }
    private String getCitacita(){
        return cita;
    }
    private int getUmur(){
        return umur;
    }
        
 public void setNamaAyah(String newNamaAyah){
     namaAyah = newNamaAyah;
     System.out.println("Nama Ayah    = " +namaAyah);
 }
 public void setNamaIbu(String newNamaIbu){
     namaIbu = newNamaIbu;
     System.out.println("Nama Ibu     = " +namaIbu);
 }
 public void setNamaSendiri(String newNamaSendiri){
     namaSendiri = newNamaSendiri;
     System.out.println("Nama Sendiri = " +namaSendiri);
 }
 public void setNamaSaudara(String newNamaSaudara){
     namaSaudara = newNamaSaudara;
     System.out.println("Nama Saudara = " +namaSaudara);
 }
 
 public void setAlamat(String newAlamat){
     alamat = newAlamat;
     System.out.println("Alamat       = " +alamat);
 }
 public void setHobi(String newHobi){
     hobi = newHobi;
     System.out.println("Hobi         = " +hobi);
 }
 public void setCitacita(String newCitacita){
     cita = newCitacita;
     System.out.println("Cita-cita    = " +cita);
 }
 public void setUmur(int newUmur){
     umur = newUmur;
     System.out.println("Umur         = " +umur);
 }

    
}
