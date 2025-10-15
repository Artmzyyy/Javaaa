public class Persegi_panjang {
    private double panjang, lebar;

    public Persegi_panjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }



    public void setPanjang(double panjang) { this.panjang = panjang; }
    public void setLebar(double lebar) { this.lebar = lebar; }
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }

    public double hitungLuas() { return panjang * lebar; }
    public double hitungKeliling() { return 2 * (panjang + lebar); }
}
