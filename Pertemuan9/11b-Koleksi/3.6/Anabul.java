/*  Nama File   : Anabul.java
 *  Deskripsi   : Kelas abstrak untuk mendefinisikan anabul
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method abstrak yang harus diimplementasikan oleh kelas anak
    public abstract void gerak();
    public abstract void bersuara();
}