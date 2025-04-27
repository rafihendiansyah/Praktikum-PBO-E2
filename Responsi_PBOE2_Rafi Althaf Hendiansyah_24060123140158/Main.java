/* Nama File : Main.java
  Deskripsi : Berisi program utama untuk menampilkan informasi ruang
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 27/03/2025
*/ 

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Fakultas Sains dan Matematika ===");
        System.out.println("/=================== RUANG KELAS ===================/");
        RuangKelas kelas = new RuangKelas("A101", 10, 8, 3, 40, 5000, 35, 5);
        kelas.tampilkanInfo();

        System.out.println("\n/=================== LAB KOMPUTER ===================/");
        LaboratoriumKomputer labKom = new LaboratoriumKomputer("A303", 12, 10, 3, 50, 6000, "Lab Kom A", 1000000, 30);
        labKom.tampilkanInfo();

        System.out.println("\n/=================== LAB BIOLOGI ===================/");
        LaboratoriumNonKomputer labBio = new LaboratoriumNonKomputer("B202", 10, 9, 3, 45, 6000, "Lab Bio", 800000, "Biologi Dasar");
        labBio.tampilkanInfo();

        System.out.println("\n/=================== RUANG DEPARTEMEN ===================/");
        RuangDepartemen departemen = new RuangDepartemen("D201", 15, 12, 3.5, 20, 7500, 10, 15, 5, "Departemen Informatika", "Dr. Budi Santoso");
        departemen.tampilkanInfo();
        
        System.out.println("\n/=================== RUANG DOSEN ===================/");
        RuangDosen dosen = new RuangDosen("D301", 5, 4, 3, 1, 7000, "Dr. Budi", 2, 1);
        dosen.tampilkanInfo();
    }
}
