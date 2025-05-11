/*  Nama File   : MapTest.java
 *  Deskripsi   : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

public class MapTest {
    public static void main(String[] args) {
        // inisialisasi Map yang hanya dapat
        // berisi objek String
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();

        // menambah elemen
        map.put("1", "praktikum");
        map.put("2", "collection");
        map.put("3", "dan generics");

        // menghapus elemen
        map.remove("1");

        // iterasi pada keseluruhan Map
        for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
    }
    
}
