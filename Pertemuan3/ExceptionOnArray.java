/* Nama File : Asersi1.java
  Deskripsi : Program penggunaan eksepsi menggunakan class library Java
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 09/03/2025
*/

public class ExceptionOnArray{
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("Clean up code...");
        }
    }
}

