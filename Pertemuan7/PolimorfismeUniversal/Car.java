/*  Nama File   : Car.java
 *  Deskripsi   : Kelas Car yang merupakan subclass dari kelas Vehicle.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Car extends Vehicle{
    void calRent (int jarak, float harga) {
        float fare = jarak * harga;
        System.out.println("harga sewa mobil = "+fare);
    }
}
