/* Nama File : Titik.java
 * Deskripsi : Berisis atribut dan method dalam class Titik
 * Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
 * Tanggal   : 20/02/2025
 */

public class Titik {
    // ATRIBUT
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // METHOD
    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titk (0,0)
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }
    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }
    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        this.absis = x;
    }

    public void setOrdinat(double y){
        this.ordinat = y;
    }

    public void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis > 0 && ordinat < 0) {
            return 3;
        } else if (absis < 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T) {
        double deltaX = this.absis - T.absis;
        double deltaY = this.ordinat - T.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }    
    
    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
}  //end class Titik