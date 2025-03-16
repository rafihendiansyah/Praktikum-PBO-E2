/* Nama File : DosenTetap.java
  Deskripsi : Pembuatan Subclass DosenTetap dari dosen
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 16/03/2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String NIDN;
    private int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    private LocalDate hitungBUP() {
        return tglLahir.plusYears(BUP).plusMonths(1);
    }

    private double hitungTunjangan() {
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("===== Dosen Tetap =====");
        System.out.println("NIDN          : " + NIDN);
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.println("BUP           : " + formatTanggal(hitungBUP()));
        System.out.println("Tunjangan     : 2% x " + hitungMasaKerja().split(" ")[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println();
    }
}
