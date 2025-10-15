public class Perkalian {
    private int pembilang1, penyebut1, pembilang2, penyebut2;

    public Perkalian(int pembilang1, int penyebut1, int pembilang2, int penyebut2){
        this.pembilang1 = pembilang1;
        this.penyebut1 = penyebut1;
        this.pembilang2 = pembilang2;
        this.penyebut2 = penyebut2;
    }

    public void hitungPerkalian(){
        int pembilangHasil;
        int penyebutHasil;

        pembilangHasil = pembilang1 * pembilang2;
        penyebutHasil = penyebut1 * penyebut2;

        System.out.println("Hasil Perkalian: " + pembilangHasil + "/" + penyebutHasil);
    }
}
