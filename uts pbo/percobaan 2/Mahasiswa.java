public class Mahasiswa extends Orang{
    private String nim;

    public Mahasiswa(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void belajar() {
        System.out.println(nim + " sedang belajar.");
    }
}