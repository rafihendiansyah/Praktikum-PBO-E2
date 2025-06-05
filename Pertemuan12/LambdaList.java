/* Nama File : LAmbdaList.java 
  Deskripsi : Implementasi penggunaan lambda pada list, digunakan sebagai parameter pada method
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 05/06/2025
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
