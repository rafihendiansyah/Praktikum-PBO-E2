/*  Nama File   : PersegiPanjang.java 
 *  Deskripsi   : Kelas untuk menghitung luas dan keliling persegi panjang
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 11 Mei 2025
 */

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        // Rumus luas persegi panjang = panjang * lebar
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        // Rumus keliling persegi panjang = 2 * (panjang + lebar)
        return 2 * (panjang + lebar);
    }
}