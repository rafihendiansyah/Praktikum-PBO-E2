/*  Nama File   : KoleksiAnabul.java
 *  Deskripsi   : Kelas KoleksiAnabul yang menyimpan koleksi objek Anabul
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

import java.util.ArrayList;
import java.util.List;


public class KoleksiAnabul<T extends Anabul> {
    private List<T> koleksi;
    
    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
    }
    
    // Menambahkan elemen ke koleksi
    public void tambahAnabul(T anabul) {
        koleksi.add(anabul);
    }
    
    // Menampilkan semua elemen koleksi
    public void showAll() {
        System.out.println("\n==== DAFTAR ANABUL ====");
        for (T anabul : koleksi) {
            System.out.println("\nNama: " + anabul.getNama());
            anabul.bersuara();
            anabul.gerak();
        }
        System.out.println("=======================");
    }
    
    // Getter untuk mendapatkan koleksi
    public List<T> getKoleksi() {
        return koleksi;
    }
}