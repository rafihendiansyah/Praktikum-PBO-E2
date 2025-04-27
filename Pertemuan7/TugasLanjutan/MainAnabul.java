/*  Nama File   : MainAnabul.java
 *  Deskripsi   : Kelas MainAnabul untuk mendemonstrasikan penggunaan kelas Anabul dan subclass-nya.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 27 April 2025
 */

public class MainAnabul {
    public static void main(String[] args) {
        // Membuat objek dari setiap jenis anabul
        Anabul kucing = new Kucing("Kitty");
        Anabul anjing = new Anjing("Max");
        Anabul burung = new Burung("Tweety");

        // Mensimulasikan suara dan gerakan setiap anabul
        System.out.println("=== Demonstrasi Anabul ===");
        
        // Kucing
        kucing.bersuara();
        kucing.bergerak();
        System.out.println();
        
        // Anjing
        anjing.bersuara();
        anjing.bergerak();
        System.out.println();
        
        // Burung
        burung.bersuara();
        burung.bergerak();
    }
}