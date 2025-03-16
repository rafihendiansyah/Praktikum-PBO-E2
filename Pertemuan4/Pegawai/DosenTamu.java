/* Nama File : DosenTamu.java
  Deskripsi : Pembuatan Subclass DosenTamu dari dosen
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 16/03/2025
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private int kontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, int kontrakBerakhir) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    private double hitungTunjangan() {
        return 0.025 * kontrakBerakhir * gajiPokok;
    }

    private LocalDate hitungTanggalBerakhir() {
        return LocalDate.now().plusMonths(kontrakBerakhir);
    }

    @Override
    public void printInfo() {
        System.out.println("===== Dosen Tamu =====");
        System.out.println("NIDK          : " + NIDK);
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.println("Masa Kontrak  : " + kontrakBerakhir + " bulan");
        System.out.println("Tanggal Berakhir Kontrak : " + formatTanggal(hitungTanggalBerakhir()));
        System.out.println("Tunjangan     : 2.5% x " + kontrakBerakhir + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println();
    }
}
