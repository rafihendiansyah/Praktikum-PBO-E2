/* Nama File : Titik.java
 * Deskripsi : Berisis atribut dan method dalam class Garis
 * Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
 * Tanggal   : 23/02/2025
 */

 public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Method

    // A. Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1). 
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
    }

    // B. Konstruktor dengan parameter masukan titik awal dan titik akhir. 
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // C. Selektor (getter) untuk setiap atribut beserta mutatornya (setter). 
    // Tambahkan pula selektor untuk mendapatkan atribut static counterGaris
    public Titik getTitikAwal(){ //selektor untuk mendapatkan titik awal
        return titikAwal;
    }

    public Titik getTitikAkhir(){ //selektor untuk mendapatkan titik akhir
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){ //mutator untuk mengset titik awal
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){ //mutator untuk mengset titik akhir
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris(){ //selektor untuk mendapatkan counter garis
        return counterGaris;
    }

    // D. Method untuk mendapatkan panjang sebuah garis
    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) 
        + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // E. Method untuk mendapatkan gradien dari sebuah garis
    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) 
        / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // F. Method untuk mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // G. Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya,
    // mengembalikan true jika sejajar dan false jika sebaliknya
    public boolean isSejajar(Garis garis){
        return this.getGradien() == garis.getGradien();
    }

    // H.  Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya,
    // mengembalikan true jika sejajar dan false jika sebaliknya. 
    public boolean isTegakLurus(Garis garis){
        return this.getGradien() * garis.getGradien() == -1;
    }

    // I. Method untuk menampilkan ke layar titik awal dan titik akhir garis. 
    public void printGaris() {
        System.out.println("Titik Awal:");
        titikAwal.printTitik();
        System.out.println("Titik Akhir:");
        titikAkhir.printTitik();
    }

    // J. Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    // Contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan garis y = 2x + 4. 
    public void printPersamaanGaris(){
        double m = (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) 
        / (titikAkhir.getAbsis() - titikAwal.getAbsis());
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("y = " + m + "x + " + c );
    }
 }