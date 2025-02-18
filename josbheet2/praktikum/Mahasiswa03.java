package praktikum;
public class Mahasiswa03 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik!";
        } else if (ipk >= 3.0) {
            return "Kinjera baik";
        } else if (ipk >= 2.0) {
            return "Kinjera cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

}
