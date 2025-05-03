/*  Nama File   : ContohMetodeGenerik.java 
 *  Deskripsi   : Main class untuk menjalankan contoh metode generik
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 3 Mei 2025
 */

public class ContohMetodeGenerik {

    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        T obj = datum.getIsi();
        obj.gerak();
        obj.bersuara();
        System.out.println();
    }

    public static void main(String[] args) {
        Datum<Kucing> kucing = new Datum<>(new Kucing("Garfield"));
        Datum<Anjing> anjing = new Datum<>(new Anjing("Tom"));
        Datum<Burung> burung = new Datum<>(new Burung("Tweety"));

        tampilkanPerilaku(kucing);
        tampilkanPerilaku(anjing);
        tampilkanPerilaku(burung);
    }
}
