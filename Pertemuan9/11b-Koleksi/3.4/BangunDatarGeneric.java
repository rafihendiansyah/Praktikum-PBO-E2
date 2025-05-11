/*  Nama File   : BangunDatarGeneric.java 
 *  Deskripsi   : Kelas generic untuk bangun datar
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    
    // Menambahkan method untuk menghitung luas
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}