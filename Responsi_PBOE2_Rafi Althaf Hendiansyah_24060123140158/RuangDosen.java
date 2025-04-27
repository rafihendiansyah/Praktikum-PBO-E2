/* Nama File : RuangDosen.java
  Deskripsi : Berisi atribut dan method dalam class RuangDosen
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahMeja;
    private int jumlahKursi;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaDosen, int jumlahMeja, int jumlahKursi) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}
