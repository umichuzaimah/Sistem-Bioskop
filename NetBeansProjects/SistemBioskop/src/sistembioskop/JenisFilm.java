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

public class JenisFilm {
    
    private String judulFilm;
    private String kategoriFilm;
    private String waktuMulai;
    
    public JenisFilm() {
        
    }
    public JenisFilm(String judulFilm, String kategoriFilm, String waktuMulai) {
        this.setJudulFilm(judulFilm);
        this.setKategoriFilm(kategoriFilm);
        this.setDate(waktuMulai);
    }
    
    void setJudulFilm(String judulFilm){
       this.judulFilm = judulFilm;
    }
    
    String getJudulFilm() {
        return judulFilm;
    }
    
    void setKategoriFilm(String kategoriFilm) {
        this.kategoriFilm = kategoriFilm;
    }
    
    String getKategoriFilm() {
        return kategoriFilm;
    }
    
    void setDate(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }
    
    String getWaktuMulai() {
        return waktuMulai;
    }
}
