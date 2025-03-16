/* Nama File : Tendik.java
  Deskripsi : Pembuatan Subclass untuk Tendik dari pegawai
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 16/03/2025
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    private int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    private LocalDate hitungBUP() {
        return tglLahir.plusYears(BUP).plusMonths(1);
    }

    private double hitungTunjangan() {
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("===== Tendik =====");
        super.printInfo();
        System.out.println("Jabatan       : Tenaga Kependidikan (Tendik)");
        System.out.println("Bidang        : " + bidang);
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.println("BUP           : " + formatTanggal(hitungBUP()));
        System.out.println("Tunjangan     : 1% x " + hitungMasaKerja().split(" ")[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println();
    }
}
