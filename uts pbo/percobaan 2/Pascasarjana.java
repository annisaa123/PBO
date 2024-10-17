public class Pascasarjana extends Mahasiswa{
    private String judulTesis;

    public Pascasarjana(String nama, int umur, String nim, String judulTesis) {
        super(nama, umur, nim);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public void penelitian() {
        System.out.println("Pascasarjana " + getNama() + " sedang melakukan penelitian dengan judul tesis: " + judulTesis);
    }
}