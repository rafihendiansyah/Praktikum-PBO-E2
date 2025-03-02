/* Nama File : MataKuliah.java
  Deskripsi : Berisi atribut dan method dalam class MataKuliah
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 02/03/2025
*/

public class MataKuliah{
    //Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    //Method

    //Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter idMatKul, nama, dan sks 
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor (Getter)
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    //Mutator (Setter)
    public void setIdmatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}