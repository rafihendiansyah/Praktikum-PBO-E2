/* Nama File : AngkaSialException.java
  Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 09/03/2025
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !");
    }
}