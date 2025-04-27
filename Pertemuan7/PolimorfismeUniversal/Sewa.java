/*  Nama File   : Sewa.java
 *  Deskripsi   : Kelas Sewa yang menguji kelas Vehicle, Car, dan Bus.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
     
        System.out.println();

        Vehicle.hitungSewa(kendaraan);
        Vehicle.hitungSewa(bis);
        Vehicle.hitungSewa(mobil);
    }
    
}

/**
 * Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan
 * penggunaan teknik polimorfisme inclusion.
 * Keuntungan penggunaan teknik polimorfisme inclusion dengan method hitungSewa(Vehicle v):
 * 
 * 1. Fleksibilitas - Satu method dapat menangani berbagai jenis kendaraan (Vehicle, Car, Bus)
 *    tanpa perlu membuat method terpisah untuk setiap jenis.
 * 
 * 2. Maintainability - Jika ada perubahan perhitungan sewa, cukup mengubah di satu tempat saja.
 *    Tidak perlu mengubah banyak method untuk setiap jenis kendaraan.
 * 
 * 3. Extensibility - Mudah menambah jenis kendaraan baru (misal Truck) tanpa mengubah method hitungSewa.
 *    Cukup membuat class baru yang extends Vehicle.
 * 
 * 4. Code Reusability - Method hitungSewa dapat digunakan ulang untuk semua subclass Vehicle,
 *    mengurangi duplikasi kode.
 * 
 * 5. Dynamic Binding - Method yang dijalankan ditentukan saat runtime sesuai dengan
 *    objek actual yang diberikan (Vehicle, Car, atau Bus).
 */

