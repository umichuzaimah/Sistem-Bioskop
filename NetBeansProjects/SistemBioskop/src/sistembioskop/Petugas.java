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
public class Petugas {
    
    private String namaPetugas;
    private String IdPetugas;
    
    public Petugas() {
    }
        
        public Petugas(String namaPetugas, String IdPetugas) throws Exception {
            this.setId(IdPetugas);
            try {
               this.setNama(namaPetugas);
            } catch (Exception e) {
                throw e;
            }
                
        }
        
        void setNama(String namaPetugas) throws Exception{
            for(char c : namaPetugas.toCharArray()){
          if  (Character.isDigit(c)) { 
          throw new Exception("Nama tidak boleh berupa angka");}
          { 
        }
          this.namaPetugas = namaPetugas; }
        }
        
        String getNama() {
            return namaPetugas;
        }
        
        void setId (String IdPetugas) {
            this.IdPetugas = IdPetugas;
        }
        
        String getId () {
            return IdPetugas;
        }
    }
