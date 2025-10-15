public class Bujur_sangkar {
    private double sisi;

    public Bujur_sangkar(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(double sisi) { this.sisi = sisi; }
    public double getSisi() { return sisi; }

    public double hitungLuas() { return sisi * sisi; }
    public double hitungKeliling() { return 4 * sisi; }
}
