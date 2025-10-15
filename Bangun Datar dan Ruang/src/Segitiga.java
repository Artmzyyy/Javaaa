public class Segitiga {
    private double alas, tinggi, sisiA, sisiB, sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double hitungLuas() { return 0.5 * alas * tinggi; }
    public double hitungKeliling() { return sisiA + sisiB + sisiC; }
}
