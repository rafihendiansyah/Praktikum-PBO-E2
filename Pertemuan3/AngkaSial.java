/* Nama File : Asersi1.java
  Deskripsi : Program penggunaan exception buatan sendiri , pengenalan klausa 'throw' dan 'throws'
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 09/03/2025
*/

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method etMessae() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!");
        }
    }

}

// Pertanyaan: 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//             2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?   

// Jawaban: 1. Baris 12 tidak dieksekusi karena ketika eksepsi terjadi yaitu angka 13 dimasukkan, 
//             eksepsi langsung dilempar sampai catch sehingga program keluar dari metode sebelum mencapai baris tersebut.
//          2. Iya, baris 21 tetap dieksekusi karena berada di dalam blok catch, 
//             yang menangani eksepsi dan tetap menjalankan kode di dalamnya.

//  Kesimpulan: Saat exception terjadi, program langsung melompat ke blok catch yang sesuai, 
//  melewati semua kode setelah throw dalam metode yang melemparkan exception tersebut.


