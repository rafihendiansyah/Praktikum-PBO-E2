/*  Nama File   : Overloading.java
 *  Deskripsi   : Kelas Overloading yang mendemonstrasikan method overloading pada Java.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Overloading {

    int tambah (int x, int y) {
        return x + y;
    }

    int tambah (int x, int y, int z) {
        return x + y + z;
    }

    double tambah (double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {
        Overloading O = new Overloading();
        System.out.println(O.tambah(1,2));
        System.out.println(O.tambah(1,2,3));
        System.out.println(O.tambah(1,2));
        System.out.println(O.tambah(2,1.0));
    }
}
