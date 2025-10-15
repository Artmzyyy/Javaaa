public class MainTester {
    public static void main(String[] args) {
        // --- Bangun 2D ---
        Persegi_panjang pp = new Persegi_panjang(5, 3);
        Persegi_panjang pp2 = new Persegi_panjang(10, 5);
        Lingkaran l = new Lingkaran(7);
        Bujur_sangkar bs = new Bujur_sangkar(4);
        Segitiga s = new Segitiga(5, 8, 3, 5, 4);
        Belah_ketupat blk = new Belah_ketupat(4, 6, 4);


        System.out.println("=== Bangun Datar ===");
        System.out.println("Luas Persegi Panjang : " + pp.hitungLuas());
        System.out.println("Luas Persegi Panjang2 : " + pp2.hitungLuas());

        System.out.println("Keliling Lingkaran : " + l.hitungKeliling());
        System.out.println("Luas Bujur Sangkar : " + bs.hitungLuas());
        System.out.println("Luas Segitiga : " + s.hitungLuas());
        System.out.println("Luas Belah Ketupat : " + blk.hitungLuas());

        // --- Bangun 3D ---
        Kubus k = new Kubus(5);
        Balok b = new Balok(4, 3, 2);
        Bola bo = new Bola(7);
        Kerucut kr = new Kerucut(7,5);
        Silinder sl = new Silinder(7,5);

        System.out.println("\n=== Bangun Ruang ===");
        System.out.println("Volume Kubus : " + k.hitungVolume());
        System.out.println("Luas Permukaan Balok : " + b.hitungLuasPermukaan());
        System.out.println("Volume Bola : " + bo.hitungVolume());
        System.out.println("Luas Permukaan Kerucut : " + kr.hitungLuasPermukaan());
        System.out.println("Luas Permukaan Silinder : " + sl.hitungLuasPermukaan());
    }
}

