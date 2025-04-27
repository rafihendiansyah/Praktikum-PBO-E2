/*  Nama File   : Coercion.java
 *  Deskripsi   : Konversi otomatis tipe data, seperti dari kecil ke besar (widening) atau besar ke kecil (narrowing).
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Coercion {
    public static void main(String[] args) {
        // Program nomer 1
        int output1 = 'a';
            System.out.println(output1);

        /** Output: 97 (Berhasil)
         * Penjelasan: Dari karakter 'a' menjadi integer 97
         * karena karakter 'a' memiliki nilai ASCII 97.
         */

         // Program nomer 2
         //double x = 15.5;
         //int output2 = x;
            //System.out.println(output2); 

        /** Output: (Gagal)
         * Penjelasan: Tidak bisa mengkonversi double ke int secara langsung.
         * Harus menggunakan casting.
         */

       // Program nomer 3
       int y = 25;
       double output3 = y;
            System.out.println(output3); 

        /** Output: 25.0 (Berhasil)
         * Penjelasan: Dari integer 25 menjadi double 25.0
         * karena integer dapat diubah menjadi double.
         */

        // Program nomer 4
        int z = 78;
        char output4 = (char) z;
            System.out.println(output4);
        
        /** Output: N (Berhasil)
         * Penjelasan: Dari integer 78 menjadi karakter 'N'
         * karena karakter 'N' memiliki nilai ASCII 78.
         */

         // Program nomer 5
         char a = 'a';
            int output5 = a;
                System.out.println(output5);
        
        /** Output: 97 (Berhasil)
         * Penjelasan: Dari karakter 'a' menjadi integer 97
         * karena karakter 'a' memiliki nilai ASCII 97.
         */
    }
}