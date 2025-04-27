/*  Nama File   : Pegawai.java
 *  Deskripsi   : Kelas Pegawai yang merupakan kelas utama untuk menguji kelas Manejer.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    //method
    //Setter 
    public void SetNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama + "\nGaji Pokok: " + gajiPokok); 

    }

}
