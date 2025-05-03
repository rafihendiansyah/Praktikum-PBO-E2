/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Kelas Lingkaran yang merupakan subclass dari BangunDatar
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 3 Mei 2025
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}
