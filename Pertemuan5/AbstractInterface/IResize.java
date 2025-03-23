/* Nama File : IResize.java
  Deskripsi : Berisi interface IResize yang berisi method zoomIn(), zoomOut(), dan zoom()
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 23/03/2025
*/ 

public interface IResize {
  void zoomIn();

  void zoomOut();

  void zoom(double percent);
}

/*
 * JAWABAN PERTANYAAN PRAKTIKUM INTERFACE:
 * ===========================================
 * 
 * Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam 
 * interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?
 * 
 * - Interface memungkinkan fleksibilitas lebih tinggi karena dapat diimplementasi 
 *   oleh berbagai class yang tidak harus berhubungan langsung dengan BangunDatar, 
 *   seperti Garis atau Bangun3D.
 * - Menggunakan interface mencegah keterikatan pada satu hierarki class tertentu, 
 *   sehingga konsep resize dapat digunakan di berbagai struktur objek yang berbeda.
 * - Interface mendukung multiple inheritance, sehingga suatu class dapat tetap 
 *   mewarisi class lain sekaligus mengimplementasikan kemampuan resize tanpa 
 *   konflik pewarisan.
 * - Memisahkan konsep ukuran (resize) dari bentuk bangun datar membuat desain 
 *   lebih modular dan mudah diperluas tanpa mengubah struktur class utama.
 */
