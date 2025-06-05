/* Nama File : LambdaMap.java 
  Deskripsi : Implementasi penggunaan lambda pada map, digunakan sebagai parameter pada method
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 05/06/2025
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123140158", "Rafi Althaf Hendiansyah");
        mahasiswaMap.put("24060123140189", "Rajwaa Kudus");
        mahasiswaMap.put("24060123140123", "Rayhan Kacamata");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM: " + key + ", Nama: " + value));
    }
}

