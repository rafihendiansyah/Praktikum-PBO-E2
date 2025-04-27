/* Nama File : LaboratoriumKomputer.java
  Deskripsi : Berisi atribut dan method dalam class LaboratoriumKomputer 
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class LaboratoriumKomputer extends Laboratorium {
    private int jumlahKomputer;

    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan, namaLab, hargaSewa, "Komputer");
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}
