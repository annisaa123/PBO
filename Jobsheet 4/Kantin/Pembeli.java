package Kantin;

import java.util.ArrayList;

public class Pembeli {
    private String idPembeli;
    private String namaPembeli;
    private ArrayList<Transaksi> transaksList;

    //konstruktor pembeli
    public Pembeli(String idPembeli, String namaPembeli) {
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.transaksList = new ArrayList<>();
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public ArrayList<Transaksi> getTransaksList() {
        return transaksList;
    }

    public void setTransaksList(ArrayList<Transaksi> transaksList) {
        this.transaksList = transaksList;
    }

    //tambahkan transaksi
    public void tambahTransaksi(Transaksi transaksi) {
        transaksList.add(transaksi);
    }

    //hapus transaksi
    public void batalkanPesanan(Transaksi transaksi) {
        transaksList.remove(transaksi);
    }
}