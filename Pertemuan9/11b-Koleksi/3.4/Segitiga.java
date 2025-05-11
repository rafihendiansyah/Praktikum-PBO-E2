/*  Nama File   : Segitiga.java
 *  Deskripsi   : Kelas untuk menghitung luas dan keliling segitiga sama sisi
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

class Segitiga extends BangunDatar {
    private double sisi;
    
    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        // Rumus luas segitiga sama sisi = (√3/4) * sisi²
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        // Rumus keliling segitiga sama sisi = 3 * sisi
        return 3 * sisi;
    }
}