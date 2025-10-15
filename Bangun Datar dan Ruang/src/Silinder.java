public class Silinder {
    private double jari, tinggi;

    public Silinder(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
}
