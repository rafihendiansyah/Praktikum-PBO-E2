/* Nama File : RuangDepartemen.java
  Deskripsi : Berisi atribut dan method dalam class RuangDepartemen
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class RuangDepartemen extends Ruang {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private String namaDepartemen;
    private String ketuaDepartemen;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, int jumlahMeja, int jumlahKursi, int jumlahLemari, String namaDepartemen, String ketuaDepartemen) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Departemen: " + namaDepartemen);
        System.out.println("Ketua Departemen: " + ketuaDepartemen);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
    }
}
