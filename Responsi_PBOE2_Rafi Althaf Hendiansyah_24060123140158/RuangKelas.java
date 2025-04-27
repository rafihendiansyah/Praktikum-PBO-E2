/* Nama File : RuangKelas.java
  Deskripsi : Berisi atribut dan method dalam class RuangKelas
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class RuangKelas extends Ruang {
    private int jumlahKursi;
    private int kursiRusak;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, int jumlahKursi, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.jumlahKursi = jumlahKursi;
        this.kursiRusak = kursiRusak;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Kursi Rusak: " + kursiRusak);
    }
}
