/*  Nama File   : Kucing.java
 *  Deskripsi   : Kelas Kucing sebagai subclass dari Anabul
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 3 Mei 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Meong");
    }
}
