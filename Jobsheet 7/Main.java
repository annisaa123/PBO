public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        // Memanggil method dari class Manusia
        manusia.bernafas();
        manusia.makan();

        // Memanggil method dengan dynamic method dispatch
        dosen.makan();
        ((Dosen) dosen).lembur(); // Memanggil lembur() dari Dosen

        mahasiswa.makan();
        ((Mahasiswa) mahasiswa).tidur(); // Memanggil tidur() dari Mahasiswa
    }
}