public class Penjumlahan {
    private int pembilang1, penyebut1, pembilang2, penyebut2;

    public Penjumlahan(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        this.pembilang1 = pembilang1;
        this.penyebut1 = penyebut1;
        this.pembilang2 = pembilang2;
        this.penyebut2 = penyebut2;
    }

    public void hitungPenjumlahan() {
        int pembilangHasil;
        int penyebutHasil;

        if (penyebut1 == penyebut2) {
            pembilangHasil = pembilang1 + pembilang2;
            penyebutHasil = penyebut1;
        } else {
            pembilangHasil = (pembilang1 * penyebut2) + (pembilang2 * penyebut1);
            penyebutHasil = penyebut1 * penyebut2;
        }

        System.out.println("Hasil penjumlahan: " + pembilangHasil + "/" + penyebutHasil);
    }
}
