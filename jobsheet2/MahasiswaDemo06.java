package jobsheet2;

public class MahasiswaDemo06 {

    public static void main(String[] args) {
        Mahasiswa06 ml = new Mahasiswa06();
        ml.nim = "023432";
        ml.nama = "Yansy Ayuningtyas";
        ml.alamat = "Nias, Sumatera Utara";
        ml.kelas = "2A";

        Mahasiswa06 m2 = new Mahasiswa06();
        m2.nim = "023433";
        m2.nama = "Annisa";
        m2.alamat = "Nganjuk, Jawa Timur";
        m2.kelas = "2C";
        m2.displayBiodata();

        Mahasiswa06 m3 = new Mahasiswa06();
        m3.nim = "023434";
        m3.nama = "Nasya";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2D";
        m3.displayBiodata();
    }
}