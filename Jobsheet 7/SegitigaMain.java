public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutC = segitiga.totalSudut(60, 30);
        System.out.println("Total Sudut C: " + sudutC);

        double kelilingSegitiga = segitiga.keliling(5.0, 6.0, 7.0);
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);
        
        double kelilingDuaSisi = segitiga.keliling(3.0, 4.0);
        System.out.println("Keliling dengan dua sisi: " + kelilingDuaSisi);
    }
}