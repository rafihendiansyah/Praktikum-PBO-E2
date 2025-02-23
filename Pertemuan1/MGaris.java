/* Nama File : Titik.java
 * Deskripsi : Menguji dari kelas Garis
 * Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
 * Tanggal   : 23/02/2025
 */

public class MGaris {
    public static void main(String[] args){
        // Konstruktor default
        System.out.println("Konstruktor default");
        Garis garis1 = new Garis(); 
        System.out.println("Garis 1: ");
        garis1.printGaris();
        System.out.println("Panjang garis1: " + garis1.getPanjang());
        System.out.println("Gradien garis1: " + garis1.getGradien());
        System.out.print("Titik Tengah garis1: ");
        garis1.getTitikTengah().printTitik();
        System.out.println();

        // Konstruktor dengan parameter
        System.out.println("Konstruktor dengan parameter");
        Titik titik1 = new Titik(5, 4);
        Titik titik2 = new Titik(2,1 );
        Garis garis2 = new Garis(titik1, titik2);
        System.out.println("Garis g2:");
        garis2.printGaris();
        System.out.println("Panjang garis1: " + garis2.getPanjang());
        System.out.println("Gradien garis1: " + garis2.getGradien());
        System.out.print("Titik Tengah garis1: ");
        garis2.getTitikTengah().printTitik();
        System.out.println();

        // Menguji sejajar
        System.out.println("Pengujian isSejajar");
        System.out.println("Garis1 dan Garis2 sejajar? " + garis1.isSejajar(garis2));
        System.out.println();

        // Menguji tegak lurus
        System.out.println("Pengujian isTegakLurus");
        System.out.println("Garis1 dan Garis2 tegak lurus?" + garis1.isTegakLurus(garis2));
        System.out.println();
        
        // Menguji Persamaan garis
        System.out.println("Pengujian Print Persamaan Garis");
        System.out.print("Persamaan garis garis2: ");
        garis2.printPersamaanGaris();
        System.out.println();

        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
