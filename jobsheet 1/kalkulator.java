import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        int angka1 = scanner.nextInt();

        System.out.println(" Masukkan operator");
        char operator = scanner.next().charAt(0);

        System.out.println("Masukkan angka kedua");
        int angka2 = scanner.nextInt();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid!");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}