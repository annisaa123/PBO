package jobsheet2;

public class PersegiPanjang06 {
    int panjang;
    int lebar;

    //Konstruktor
    public PersegiPanjang06(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //Method untuk menampilkan data panjang dan lebar
    public void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    //Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    //Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}