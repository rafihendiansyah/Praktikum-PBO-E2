/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas Burung yang merupakan subclass dari Anabul.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 27 April 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
}