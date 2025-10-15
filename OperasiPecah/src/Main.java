public class Main {
    public static void main(String[] args) {
        Penjumlahan p = new Penjumlahan(1, 2, 1, 3);
        p.hitungPenjumlahan();

        Pengurangan p1 = new Pengurangan(5, 6, 3, 6);
        p1.hitungPengurangan();

        Perkalian kali = new Perkalian(1, 2, 1, 2);
        kali.hitungPerkalian();

        Pembagian bagi = new Pembagian(1,3,2,3);
        bagi.hitungPembagian();
    }
}
