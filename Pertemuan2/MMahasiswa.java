/* Nama File : MMahasiswa.java
  Deskripsi : Menguji dari berbagai kelas yang terlibat dalam relasi antar objek
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 02/03/2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("206", "Rafi", "Informatika");
        Dosen D1 = new Dosen("123", "Althaf", "Informatika");
        Kendaraan K1 = new Kendaraan("AB1881AB", "motor");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        M1.printDetailMhs();

        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
