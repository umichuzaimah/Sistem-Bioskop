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
import java.io.*;

public class SistemBioskop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Selamat Datang");
        System.out.println(" ================================== ");
        // petugas
        Petugas petugas1 = new Petugas();
        petugas1.setId("1234A");
        try {
            petugas1.setNama("Umi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // penonton
        Penonton penonton1 = new Penonton();
        System.out.print("Masukkan nama anda :");
        String namaPenonton = br.readLine();
        try {
            penonton1.setNamaPenonton(namaPenonton);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Masukkan ID Anda :");
        String nomorId = br.readLine();
        penonton1.setNomorId(nomorId);
        
        
        //jenis film
        JenisFilm jenisfilm1 = new JenisFilm();
        System.out.println("Berikut pilihan film hari ini :");
        System.out.println("The Avengers");
        System.out.println("Fast And The Furious 7");
        System.out.println("Kungfu Panda 3");
        System.out.println("Refrain");
        System.out.print("Silahkan masukkan pilihan film Anda :");
        String judulFilm = br.readLine();
        jenisfilm1.setJudulFilm(judulFilm);
        System.out.println("Silahkan pilih jadwal film Anda : ");
        System.out.println("12.00");
        System.out.println("14.00");
        System.out.println("16.00");
        System.out.println("18.00");
        System.out.println("20.00");
        System.out.print("Jadwal pilihan anda : ");
        String waktuMulai = br.readLine();
        jenisfilm1.setDate(waktuMulai);
        
        // nomor kursi
        NomorKursi nomorkursi1 = new NomorKursi();
        System.out.print("Silahkan pilih kode kursi Anda : ");
        String kodeKursi = br.readLine();
        try {
            nomorkursi1.setKodeKursi(kodeKursi);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.print("Silahkan pilih nomor kursi Anda : ");
        int nomorKursi = Integer.parseInt(br.readLine());
        nomorkursi1.setNomorKursi(nomorKursi);
        
        
        // transaksi
        Transaksi transaksi1 = new Transaksi();
        transaksi1.setHarga(30000);
        
        
        // karcis
        Karcis karcis1 = new Karcis();
        karcis1.setPenonton(penonton1);
        karcis1.setJenisFilm(jenisfilm1);
        karcis1.setNomorKursi(nomorkursi1);
        karcis1.setTransaksi(transaksi1);
        cetakKarcis(karcis1);
      
    }
    
        static void cetakKarcis(Karcis karcis1) {
            System.out.println();
            System.out.println("Terima kasih telah memesan tiket");
            System.out.println("Berikut keterangan film Anda ");
            System.out.println(" ================================== ");
            System.out.println(karcis1.getPenonton().getNamaPenonton());
            System.out.println(karcis1.getJenisFilm().getJudulFilm());
            System.out.println(karcis1.getJenisFilm().getWaktuMulai());
            System.out.print(karcis1.getNomorKursi().getKodeKursi());
            System.out.println(karcis1.getNomorKursi().getNomorKursi());
            System.out.println(karcis1.getTransaksi().getHarga());
            
            
            
        }
    
}
