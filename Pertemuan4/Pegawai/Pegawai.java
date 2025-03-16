/* Nama File : Pegawai.java
  Deskripsi : Pembuatan Superclass untuk semua pegawai
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 16/03/2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(formatter);
    }

    protected String hitungMasaKerja() {
        Period masaKerja = Period.between(TMT, LocalDate.now());
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    public void printInfo() {
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tglLahir));
        System.out.println("TMT           : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
    }
}
