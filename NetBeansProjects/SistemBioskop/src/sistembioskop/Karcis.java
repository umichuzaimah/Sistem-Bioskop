

package sistembioskop;

public class Karcis {
    
    private Penonton penonton;
    private JenisFilm jenisFilm;
    private NomorKursi nomorKursi;
    private Transaksi transaksi;

    /**
     * @return the penonton
     */
    public Penonton getPenonton() {
        return penonton;
    }

    /**
     * @param penonton the penonton to set
     */
    public void setPenonton(Penonton penonton) {
        this.penonton = penonton;
    }

    /**
     * @return the jenisFilm
     */
    public JenisFilm getJenisFilm() {
        return jenisFilm;
    }

    /**
     * @param jenisFilm the jenisFilm to set
     */
    public void setJenisFilm(JenisFilm jenisFilm) {
        this.jenisFilm = jenisFilm;
    }

    /**
     * @return the nomorKursi
     */
    public NomorKursi getNomorKursi() {
        return nomorKursi;
    }

    /**
     * @param nomorKursi the nomorKursi to set
     */
    public void setNomorKursi(NomorKursi nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    /**
     * @return the transaksi
     */
    public Transaksi getTransaksi() {
        return transaksi;
    }

    /**
     * @param transaksi the transaksi to set
     */
    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }
}