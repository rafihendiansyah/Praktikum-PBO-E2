/*  Nama File   : Mkoleksi.java
 *  Deskripsi   : Kelas untuk menguji Koleksi
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        for (char c = 'A'; c <= 'J'; c++) {
            koleksiKarakter.add(c);
        }

        System.out.println("Koleksi Karakter");
        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(1, 'Z');
        System.out.println("Koleksi Karakter setelah dilakukan setIsi");
        koleksiKarakter.showAll();
        System.out.println("Elemen koleksi saat ini : " + koleksiKarakter.getSize());

        Character hapus = koleksiKarakter.delete();
        System.out.println("Koleksi Karakter setelah dilakukan delete");
        koleksiKarakter.showAll();
        System.out.println("Elemen yang terhapus : " + hapus);
        System.out.println("Elemen koleksi saat ini : " + koleksiKarakter.getSize());
    }
}
