public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek BangunDatar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Merah");
        bd.setBorder("Hitam");

        // Membuat objek Persegi
        Persegi p = new Persegi(5, "Hijau", "Kuning");

        // Membuat objek Lingkaran
        Lingkaran l = new Lingkaran(10, "Biru", "Putih"); 

        System.out.println("Info BangunDatar");
        bd.printInfo();
        System.out.println("============");

        System.out.println("Info Persegi");
        System.out.println("Jumlah sisi Persegi: " + p.jmlSisi);
        System.out.println("Jumlah sisi Persegi: " + p.getJmlSisi());
        System.out.println("Warna Persegi: " + p.getWarna());
        System.out.println("Border Persegi: " + p.getBorder());
        System.out.println("Ukuran sisi BangunDatar: " + p.getSisi());
        p.printInfo();
        System.out.println("============");

        // Menampilkan informasi Lingkaran
        System.out.println("Info Lingkaran");
        System.out.println("Jari-jari Lingkaran: " + l.getJari());
        System.out.println("Luas Lingkaran: " + l.getLuas());
        System.out.println("Keliling Lingkaran: " + l.getKeliling());
        System.out.println("Warna Lingkaran: " + l.getWarna());
        System.out.println("Border Lingkaran: " + l.getBorder());
        System.out.println("============");

        // Mengubah nilai sisi Persegi
        p.setSisi(6);
        p.printInfo();
    }
}
