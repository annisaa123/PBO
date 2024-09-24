package jobsheet2;
public class HPDemo06 {

    public static void main(String[] args) {
        HP06 hp1 = new HP06();
        hp1.merk = "Samsung";
        hp1.kamera = 12;
        hp1.lcd = "IPS";
        hp1.ukuranLayar = 6.5;
        hp1.ram = 8;
        hp1.baterai = 5000;
        hp1.penyimpanan = 128;
        hp1.fitur = "Fingerprint";
    
        HP06 hp2 = new HP06();
        hp2.merk = "Xiamoi";
        hp2.kamera = 16;
        hp2.lcd = "AMOLED";
        hp2.ukuranLayar = 6.5;
        hp2.ram = 6;
        hp2.baterai = 5000;
        hp2.penyimpanan = 256;
        hp2.fitur = "Face Unlock";

        //mengeksekusi method
        hp1.mengambilGambarDanVideo();
        hp2.bermainGame();
        hp1.memutarMusik();
    }
}
