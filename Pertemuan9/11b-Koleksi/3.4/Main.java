/*  Nama File   : Main.java
 *  Deskripsi   : Kelas untuk menguji bangun datar generic
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

public class Main {
    public static void main(String[] args) {
        // Membuat instance untuk Persegi
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        Persegi persegi = new Persegi(5);
        bdgPersegi.set(persegi);
        
        // Membuat instance untuk PersegiPanjang
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        bdgPersegiPanjang.set(persegiPanjang);
        
        // Membuat instance untuk Segitiga
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        Segitiga segitiga = new Segitiga(10);
        bdgSegitiga.set(segitiga);
        
        // Menampilkan hasil perhitungan
        System.out.println("HASIL PERHITUNGAN BANGUN DATAR");
        System.out.println("------------------------------");
        
        System.out.println("Persegi dengan sisi " + persegi.getSisi());
        System.out.println("Luas: " + bdgPersegi.hitungLuas());
        System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
        System.out.println();
        
        System.out.println("Persegi Panjang dengan panjang " + persegiPanjang.getPanjang() + 
                           " dan lebar " + persegiPanjang.getLebar());
        System.out.println("Luas: " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Keliling: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println();
        
        System.out.println("Segitiga Sama Sisi dengan sisi " + segitiga.getSisi());
        System.out.println("Luas: " + bdgSegitiga.hitungLuas());
        System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
    }
}