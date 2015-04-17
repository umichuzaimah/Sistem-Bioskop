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
public class NomorKursi {
    
    private String kodeKursi;
    private int nomorKursi;
    private String nomorStudio;
    private JenisFilm judulFilm;
    
    public NomorKursi(){
        
    }
    
    public NomorKursi(String kodeKursi,int nomorKursi, String nomorStudio ) throws Exception{
        try {
            this.setKodeKursi(kodeKursi);
        } catch (Exception e) {
            throw e;
        }
        this.setNomorKursi(nomorKursi);
        this.setNomorStudio(nomorStudio);
    }
    
    
    
    void setNomorKursi(int nomorKursi){
        this.nomorKursi = nomorKursi;
    }
    
    int getNomorKursi() {
        return nomorKursi;
    }
    
    void setNomorStudio(String nomorStudio) {
        this.nomorStudio = nomorStudio;
    }
    
    String getNomorStudio () {
        return nomorStudio;
    }

    /**
     * @return the kodeKursi
     */
    public String getKodeKursi() {
        return kodeKursi;
    }

    /**
     * @param kodeKursi the kodeKursi to set
     */
    public void setKodeKursi(String kodeKursi)throws Exception {
        for(char c : kodeKursi.toCharArray()) {
             if(Character.isDigit(c)) {
                 throw new Exception ("Tidak boleh berupa angka");
             }   
            }
       this.kodeKursi = kodeKursi;
    }

    /**
     * @return the judulFilm
     */
    public JenisFilm getJudulFilm() {
        return judulFilm;
    }

    /**
     * @param judulFilm the judulFilm to set
     */
    public void setJudulFilm(JenisFilm judulFilm) {
        this.judulFilm = judulFilm;
    }
    
}
