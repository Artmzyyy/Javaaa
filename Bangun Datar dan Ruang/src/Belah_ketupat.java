public class Belah_ketupat {
    private double d1, d2, sisi;

    public Belah_ketupat(double d1, double d2, double sisi) {
        this.d1 = d1; this.d2 = d2; this.sisi = sisi;
    }

    public double hitungLuas() { return (d1 * d2) / 2; }
    public double hitungKeliling() { return 4 * sisi; }

}
