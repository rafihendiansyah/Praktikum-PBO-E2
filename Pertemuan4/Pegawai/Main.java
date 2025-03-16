/* Nama File : Main.java
  Deskripsi : Pembuatan main untuk menguji 
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 16/03/2025
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");
        DosenTamu dosenTamu = new DosenTamu("9876543210", "12345678", "Budi", LocalDate.of(1990, 3, 15), LocalDate.of(2020, 7, 1), 4500000, "Fakultas Sains dan Matematika", 9);
        Tendik tendik = new Tendik("1023456789", "Dewi", LocalDate.of(2000, 5, 5), LocalDate.of(2015, 7, 1), 5000000, "Akademik");

        dosenTetap.printInfo();
        dosenTamu.printInfo();
        tendik.printInfo();
    }
}
