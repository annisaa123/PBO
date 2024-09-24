package Kantin;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private PegawaiKantin pegawai;
    private Pembeli pembeli;
    private ArrayList<String> items;
    private int totalHarga;
    private double uangPembayaran;

    // Konstruktor untuk inisialisasi objek Transaksi
    public Transaksi(String idTransaksi, PegawaiKantin pegawai, Pembeli pembeli) {
        this.idTransaksi = idTransaksi;
        this.pegawai = pegawai;
        this.pembeli = pembeli;
        this.items = new ArrayList<>();
        this.totalHarga = 0;
        this.uangPembayaran = 0;
    }

    public ArrayList<String> getItems() {
        return items;
    }
    public double getUangPembayaran() {
        return uangPembayaran;
    }

    public void setUangPembayaran(double uangPembayaran) {
        this.uangPembayaran = uangPembayaran;
    }

    public double hitungKembalian() {
        return uangPembayaran - totalHarga;
    }

    public void hitungTotalHarga() {
        totalHarga = items.size() * 20000;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return  "Transaksi ID    : " + idTransaksi + "\n" +
                "Pembeli        : " + pembeli.getNamaPembeli() + "\n" +
                "Total Harga    : Rp. " + df.format(totalHarga) + "\n" +
                "Uang Pembayaran : Rp. " + df.format(uangPembayaran) + "\n" +
                "Kembalian      : Rp. " + df.format(hitungKembalian()) + "\n";
    }
}