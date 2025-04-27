/* Nama File : LaboratoriumNonKomputer.java
  Deskripsi : Berisi atribut dan method dalam class LaboratoriumNonKomputer 
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class LaboratoriumNonKomputer extends Laboratorium {
    private String mataKuliah;

    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan, String namaLab, double hargaSewa, String mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan, namaLab, hargaSewa, "Non-Komputer");
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mata Kuliah yang Dihandle: " + mataKuliah);
    }
}
