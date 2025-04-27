/*  Nama File   : Anabul.java
 *  Deskripsi   : Kelas Anabul yang merupakan kelas abstrak untuk hewan peliharaan.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 27 April 2025
 */


public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}