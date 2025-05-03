/*  Nama File   : Anabul.java
 *  Deskripsi   : Kelas Anabul sebagai superclass dari Anjing, Kucing, dan Burung
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 3 Mei 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
