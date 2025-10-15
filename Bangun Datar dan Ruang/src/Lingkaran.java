public class Lingkaran {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public void setJari(double jari) { this.jari = jari; }
    public double getJari() { return jari; }

    public double hitungLuas() { return Math.PI * jari * jari; }
    public double hitungKeliling() { return 2 * Math.PI * jari; }
}
