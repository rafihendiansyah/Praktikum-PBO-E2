/* Nama File : Kendaraan.java
  Deskripsi : Berisi atribut dan method dalam class Mahasiswa
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 02/03/2025
*/

import java.util.ArrayList;

public class Mahasiswa{
    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Method

    // Konstruktor tanpa parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    //Konstruktor dengan parameter nim, nama, prodi
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Selektor (getter)
    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    // Mutator (setter)
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Method addMatkul() untuk mendambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatkul(MataKuliah mataKuliah){
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(mataKuliah);
        } 
        else{
            System.out.println("List Mata Kuliah Sudah Penuh");
        }
    }

    //Method getJumlahSKS() untuk mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlah = 0;
        for (MataKuliah matkul : this.listMatkul){
            jumlah += matkul.getSks();
        }
        return jumlah;
    }

    //Method getJumlahMatkul() untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return this.listMatkul.size();
    }

    //Method printMhs() untuk menampilkan nim, nama, dan prodi mahasiswa 
    public void printMhs(){
        System.out.println("NIM  \t\t" + nim);
        System.out.println("Nama \t\t" + nama);
        System.out.println("Prodi \t\t" + prodi);
    }

    //Method printDetailMhs()
    //untuk menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        int i;
        for (i=0; i<listMatkul.size(); i++){
            System.out.println((i+1) + ". " +listMatkul.get(i).getNama());
        }
        System.out.println("Dosen wali\t:" + dosenWali.getNama());
        System.out.println("Kendaraan\t:" +kendaraan.getJenis());
    }


}