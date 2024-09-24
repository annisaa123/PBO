package jobsheet2;

public class DemoPersegiPanjang06 {

    public static void main(String[] args) {
        PersegiPanjang06 persegiPanjang = new PersegiPanjang06(10, 5);

        persegiPanjang.displayInfo();

        int luas = persegiPanjang.getLuas();
        System.out.println("Luas : " + luas);

        int keliling = persegiPanjang.getKeliling();
        System.out.println("Keliling : " + keliling);
    }
}