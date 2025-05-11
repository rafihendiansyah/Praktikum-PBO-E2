/*  Nama File   : Main.java
 *  Deskripsi   : Kelas untuk menguji Anabul
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Membuat objek KoleksiAnabul
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();
        
        // Membuat array nama acak untuk anabul
        String[] namaKucing = {"Ray", "Kitty", "Fluffy", "Garfield", "Tom"};
        String[] namaAnjing = {"Rajwa", "Max", "Rocky", "Duke", "Charlie"};
        String[] namaBurung = {"Daffa", "Polly", "Rio", "Daffy", "Woody"};
        
        // Membuat objek Random untuk pemilihan acak
        Random random = new Random();
        
        // Mengisi koleksi dengan 10 elemen acak
        for (int i = 0; i < 10; i++) {
            // Menentukan jenis anabul secara acak (0: Kucing, 1: Anjing, 2: Burung)
            int jenisAnabul = random.nextInt(3);
            
            // Membuat objek anabul sesuai dengan jenis yang dipilih secara acak
            switch (jenisAnabul) {
                case 0:
                    String namaKucingAcak = namaKucing[random.nextInt(namaKucing.length)];
                    koleksiAnabul.tambahAnabul(new Kucing(namaKucingAcak + "-" + (i+1)));
                    break;
                case 1:
                    String namaAnjingAcak = namaAnjing[random.nextInt(namaAnjing.length)];
                    koleksiAnabul.tambahAnabul(new Anjing(namaAnjingAcak + "-" + (i+1)));
                    break;
                case 2:
                    String namaBurungAcak = namaBurung[random.nextInt(namaBurung.length)];
                    koleksiAnabul.tambahAnabul(new Burung(namaBurungAcak + "-" + (i+1)));
                    break;
            }
        }
        
        // Menampilkan semua elemen koleksi
        koleksiAnabul.showAll();
    }
}