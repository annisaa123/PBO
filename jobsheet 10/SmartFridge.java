public class SmartFridge extends AlatElektronik implements Audible {
    private int volume;

    // Konstruktor
    public SmartFridge(int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    @Override
    public String getInfo() {
        return "SmartFridge [Volume: " + volume + ", " + super.getInfo() + "]";
    }
}