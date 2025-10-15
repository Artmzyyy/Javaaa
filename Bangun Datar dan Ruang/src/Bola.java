public class Bola {
    private double jari;

    public Bola(double jari) {
        this.jari = jari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }

    public double hitungVolume() {
        return (4.0/3) * Math.PI * jari * jari * jari;
    }
}
