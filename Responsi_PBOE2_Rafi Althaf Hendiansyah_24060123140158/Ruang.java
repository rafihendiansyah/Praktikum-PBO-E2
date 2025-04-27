/* Nama File : Ruang.java
  Deskripsi : Berisi atribut dan method superclass Ruang
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class Ruang {
    protected String kode;
    protected double panjang, lebar, tinggi;
    protected int kapasitas;
    protected double tarifKebersihan;

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        this.tarifKebersihan = tarifKebersihan;
    }

    public double hitungBiayaKebersihan() {
        return panjang * lebar * tarifKebersihan;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Dimensi: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas: " + kapasitas + " orang");
        System.out.println("Tarif Kebersihan: Rp" + tarifKebersihan);
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }
}
