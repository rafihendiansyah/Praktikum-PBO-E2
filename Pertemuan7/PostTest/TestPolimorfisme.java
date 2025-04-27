/*  Nama File   : TestPolimorfisme.java
 *  Deskripsi   : Kelas TestPolimorfisme untuk menguji kelas Pegawai dan subclassnya.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manejer("Budi");
        Pegawai pegawai3 = new Programmer("Siti");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println("===================================");
        }
    }
}

/**
 * 1. Output program akan menampilkan:
 * Nama: Mira
 * Gaji Pokok: 5000000
 * Bonus: 450000
 * ===================================
 * Nama: Budi
 * Gaji Pokok: 5000000
 * Tunjangan: 700000
 * ===================================
 * Nama: Siti
 * Gaji Pokok: 5000000
 * Bonus: 450000
 * ===================================
 * 
 * 2. Manfaat polimorfisme pada kasus ini:
 * - Fleksibilitas: Dapat mengelola berbagai tipe pegawai (Programmer & Manejer) dalam satu ArrayList
 * - Code reuse: Menggunakan satu method tampilData() untuk semua tipe pegawai
 * - Maintainability: Perubahan implementasi di child class tidak mempengaruhi main program
 * - Extensibility: Mudah menambah tipe pegawai baru tanpa mengubah kode yang ada
 * 
 * 3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?:
 * - Harus membuat ArrayList terpisah untuk setiap tipe pegawai
 * - Perlu multiple loop untuk menampilkan data tiap tipe pegawai
 * - Duplikasi kode untuk handling tiap tipe pegawai
 * - Kode menjadi tidak fleksibel dan sulit dimaintain
 * 
 */
