/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas Burung sebagai subclass dari Anabul
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 3 Mei 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit");
    }
}
