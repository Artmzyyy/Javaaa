public class Kerucut {
    private double jari, tinggi;

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        double s = Math.sqrt((jari * jari) + (tinggi * tinggi));
        return Math.PI * jari * (jari + s);
    }

    public double hitungVolume() {
        return (1.0/3) * Math.PI * jari * jari * tinggi;
    }
}
