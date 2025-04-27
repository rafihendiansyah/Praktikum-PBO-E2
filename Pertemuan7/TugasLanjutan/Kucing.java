/*  Nama File   : Kucing.java
 *  Deskripsi   : Kelas Kucing yang merupakan subclass dari Anabul.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 27 April 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}