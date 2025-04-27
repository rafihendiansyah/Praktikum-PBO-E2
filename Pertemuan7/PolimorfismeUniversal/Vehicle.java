/*  Nama File   : Vehicle.java
 *  Deskripsi   : Kelas Vehicle yang merupakan superclass untuk kelas Car dan Bus.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Vehicle {
    void calRent (int distance, float price) {
        float fare=distance * price;
        System.out.println("vehicle price = "+fare);
    }

    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 8000);
    }
    
}
