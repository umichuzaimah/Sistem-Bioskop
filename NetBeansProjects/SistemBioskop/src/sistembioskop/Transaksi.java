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
public class Transaksi {
    
    private JenisFilm judulFilm;
    private JenisFilm waktuMulai;
    private int harga;

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

    /**
     * @return the waktuMulai
     */
    public JenisFilm getWaktuMulai() {
        return waktuMulai;
    }

    /**
     * @param waktuMulai the waktuMulai to set
     */
    public void setWaktuMulai(JenisFilm waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
