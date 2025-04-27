/*  Nama File   : Anjing.java
 *  Deskripsi   : Kelas Anjing yang merupakan subclass dari Anabul.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 27 April 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}