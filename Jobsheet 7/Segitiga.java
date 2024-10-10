public class Segitiga {
    
    // Method untuk menghitung total sudut segitiga
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloaded untuk menghitung total sudut dengan satu parameter
    public int totalSudut(int sudut) {
        return 180 - sudut;
    }

    // Method untuk menghitung keliling segitiga
    public double keliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloaded untuk menghitung keliling segitiga dengan dua sisi
    public double keliling(double sisiA, double sisiB) {
        return sisiA + sisiB + Math.sqrt(sisiA * sisiA + sisiB * sisiB);
    }
}