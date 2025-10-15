public class Pembagian {
    private int pembilang1, penyebut1, pembilang2, penyebut2;

    public Pembagian(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        this.pembilang1 = pembilang1;
        this.penyebut1 = penyebut1;
        this.pembilang2 = pembilang2;
        this.penyebut2 = penyebut2;
    }

    public void hitungPembagian(){
        int pembilangHasil;
        int penyebutHasil;
        int temp = 0;

        temp = pembilang2;
        pembilang2 = penyebut2;
        penyebut2 = temp;

        System.out.println("Pembilang1 " + pembilang1);
        System.out.println("Penyebut1 " + penyebut1);
        System.out.println("Pembilang2 " + pembilang2);
        System.out.println("Penyebut2 " + penyebut2);

        pembilangHasil = pembilang1 * pembilang2;
        penyebutHasil = penyebut1 * penyebut2;


        System.out.println("Hasil Pembagian : " + pembilangHasil + "/" + penyebutHasil);
    }
}
