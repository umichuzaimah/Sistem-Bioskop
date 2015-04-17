/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistembioskop;

/**
 *
 * @author SONY
 */
public class Penonton {
    
    private String namaPenonton;
    private String nomorId;
    private int umur;
    
    void setNamaPenonton (String namaPenonton) throws Exception{
        for(char c : namaPenonton.toCharArray()){
          if  (Character.isDigit(c)) { 
          throw new Exception("Nama tidak boleh berupa angka");}
          { 
        }
        this.namaPenonton = namaPenonton; }
    }
    
    String getNamaPenonton (){
        return namaPenonton;
    }
    
    void setNomorId (String nomorId) {
        this.nomorId = nomorId;
    }
    
    String getNomorId() {
        return nomorId;
    }
    
    void setUmur (int umur){
        this.umur = umur;
            }
    
    int getUmur(){
        return umur;
    }
}
