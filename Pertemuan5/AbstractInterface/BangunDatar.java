/* Nama File : BangunDatar.java
  Deskripsi : Berisi atribut dan method dalam class BangunDatar
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 23/03/2025
*/ 

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }  

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

/*
 * JAWABAN PERTANYAAN PRAKTIKUM ABSTRACT CLASS:
 * ===========================================
 * 
 * 1. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk 
 * membandingkan objek bangun datar yang berbeda?
 * 
 * Ya, metode isEqualLuas() dan isEqualKeliling() dapat membandingkan objek 
 * bangun datar yang berbeda karena konsep polimorfisme. Semua subclass 
 * BangunDatar memiliki metode getLuas() dan getKeliling(), sehingga perbandingan 
 * dapat dilakukan tanpa memperhatikan tipe objeknya.
 * 
 * 2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda 
 * membuat method isEqualLuas() dan isEqualKeliling() pada class BangunDatar? 
 * Mengapa?
 * 
 * Bisa, tetapi tidak ideal. BangunDatar tidak memiliki cara umum untuk 
 * menghitung luas dan keliling, sehingga metode ini membutuhkan implementasi 
 * default yang tidak logis. Selain itu, objek BangunDatar dapat dibuat, 
 * meskipun tidak memiliki bentuk spesifik.
 * 
 * 3. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class 
 * daripada non-abstract class?
 * 
 * - Memastikan setiap subclass mengimplementasikan getLuas() dan getKeliling().
 * - Mencegah instansiasi langsung BangunDatar, karena tidak memiliki bentuk spesifik.
 * - Mendukung polimorfisme untuk perbandingan objek bangun datar.
 * - Membuat struktur kode lebih rapi dan mudah dipelihara.
 */
