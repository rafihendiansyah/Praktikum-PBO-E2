/* Nama File : Laboratorium.java
  Deskripsi : Berisi atribut dan method dalam class Laboratorium berperan sebagai subclass dan superclass
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class Laboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    private String kategori;

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa, String kategori) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.kategori = kategori;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Laboratorium: " + namaLab);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga Sewa: " + hargaSewa);
    }
}
