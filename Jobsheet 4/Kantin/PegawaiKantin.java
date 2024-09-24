package Kantin;

import java.util.ArrayList;

public class PegawaiKantin {
    private String idPegawai;
    private String namaPegawai;
    private ArrayList<Transaksi> transaksList;

    //konstruktor pegawai kantin
    public PegawaiKantin(String idPegawai, String namaPegawai) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.transaksList = new ArrayList<>();
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public ArrayList<Transaksi> getTransaksList() {
        return transaksList;
    }

    public void setTransaksList(ArrayList<Transaksi> transaksList) {
        this.transaksList = transaksList;
    }

    //tambahkan transaksi
    public void layaniTransaksi(Transaksi transaksi) {
        transaksList.add(transaksi);
    }
}