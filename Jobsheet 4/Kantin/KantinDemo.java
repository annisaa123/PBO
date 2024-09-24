package Kantin;

public class KantinDemo {
    public static void main(String[] args) {
        // Membuat objek pegawai dan pembeli
        PegawaiKantin pegawai1 = new PegawaiKantin("P01", "Niken");
        Pembeli pembeli1 = new Pembeli("Pm01", "Annisa");

        // Membuat transaksi
        Transaksi transaksi1 = new Transaksi("TRX01", pegawai1, pembeli1);
        transaksi1.getItems().add("Item 1");
        transaksi1.getItems().add("Item 2");
        transaksi1.hitungTotalHarga();

        // Menambahkan uang pembayaran
        transaksi1.setUangPembayaran(50000);

        System.out.println("========== TRANSAKSI PEMBELIAN ===========");
        pegawai1.layaniTransaksi(transaksi1);
        pembeli1.tambahTransaksi(transaksi1);
        System.out.println(transaksi1);
    }
}