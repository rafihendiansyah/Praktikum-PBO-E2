/* Nama File : MTitik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
 * Tanggal   : 20/02/2025
 */ 

 public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        
        Titik T2 = T1; //membuat objek titik T2 (3,5)
        T2.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(5);

        Titik T3 = new Titik(); 
        T3.setAbsis(7);
        T3.setOrdinat(-3);
        
        Titik T4 = new Titik(); 
        T4.setAbsis(1);
        T4.setOrdinat(2);
        

        System.out.println("\n/******************* TITIK *******************/");
        System.out.println("Koordinat T1 adalah: ");
        T1.printTitik();
        System.out.println("Koordinat T2 adalah: ");
        T2.printTitik();
        System.out.println("Koordinat T3 adalah: ");
        T3.printTitik();
        System.out.println("Koordinat T4 adalah: ");
        T4.printTitik();
        

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        System.out.println("\n/******************* GET KUADRAN *******************/");
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());
        System.out.println("T2 berada di kuadran: " + T2.getKuadran());
        System.out.println("T3 berada di kuadran: " + T3.getKuadran());

        System.out.println("\n/******************* GET JARAK *******************/");
        System.out.println("Jarak T2 dan T3: " + T1.getJarak(T3));

        System.out.println("\n/******************* REFLEKSI X *******************/");
        T3.refleksiX();
        System.out.println("T3 setelah refleksiX: (" + T3.absis + ", " + T3.ordinat + ") ");
        
        System.out.println("\n/******************* REFLEKSI Y *******************/");
        T2.refleksiY();
        System.out.println("T2 setelah refleksi Y: ");
        T2.printTitik();

        System.out.println("\n/******************* GET REFLEKSI X *******************/");
        Titik T_refleksi1 = T4.getRefleksiX();
        System.out.println("T4 setelah refleksi terhadap sumbu X:");
        T_refleksi1.printTitik();

        System.out.println("\n/******************* GET REFLEKSI Y *******************/");
        Titik T_refleksi2 = T4.getRefleksiY();
        System.out.println("T4 setelah refleksi terhadap sumbu Y:");
        T_refleksi2.printTitik();
    }
 }
