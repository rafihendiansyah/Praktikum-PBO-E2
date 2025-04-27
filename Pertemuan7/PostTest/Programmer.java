/*  Nama File   : Programmer.java
 *  Deskripsi   : Kelas Programmer yang merupakan subclass dari kelas Pegawai.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    //Method
    //Konstruktor
    public Programmer(String nama) {
        SetNama(nama);
    }

    //Tampil Data Programmer
    @Override
    public void tampilData() {
        super.tampilData(); //memanggil method dari class Pegawai
        System.out.println("Bonus: " + bonus);
    }
}

