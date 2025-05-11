/*  Nama File   : Persegi.java
 *  Deskripsi   : Kelas untuk menghitung luas dan keliling persegi
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
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
        // Rumus luas persegi = sisi * sisi
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        // Rumus keliling persegi = 4 * sisi
        return 4 * sisi;
    }
}