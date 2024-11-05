public class Main {
    public static void main(String[] args) {
        // Instansiasi objek dari setiap kelas
        TV tv = new TV("LED", 20, 5000.0, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 3000.0, "Putih", "LG");
        SmartFridge smartFridge = new SmartFridge(10, 7000.0, "Silver", "Whirlpool");

        // Tampilkan informasi dari setiap objek dengan format yang rapi
        System.out.println("==================================");
        System.out.println("Informasi Alat Elektronik:");
        System.out.println("----------------------------------");
        System.out.println(tv.getInfo());
        System.out.println("----------------------------------");
        System.out.println(kulkas.getInfo());
        System.out.println("----------------------------------");
        System.out.println(smartFridge.getInfo());
        System.out.println("==================================");
    }
}