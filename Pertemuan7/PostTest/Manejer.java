/*  Nama File   : Menejer.java
 *  Deskripsi   : Kelas Manejer yang merupakan subclass dari kelas Pegawai.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Manejer extends Pegawai {
    private int tunjangan = 700000;

    //Method
    //Konstruktor
    public Manejer(String nama) {
        SetNama(nama);
    }

    //Tampil Data Manejer
    @Override
    public void tampilData() {
        super.tampilData(); //memanggil method dari class Pegawai
        System.out.println("Tunjangan: " + tunjangan);
    }
    
}
