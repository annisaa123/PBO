package jobsheet03;

public class User06 {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User06(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakInfo() {
        System.out.println("Username : " + this.username);
        System.out.println("Nama : " + this.nama);
        System.out.println("Email : " + this.email);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Pekerjaan : " + this.pekerjaan);
        System.out.println("========================");
    }
}
