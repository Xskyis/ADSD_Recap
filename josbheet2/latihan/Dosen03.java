package latihan;

public class Dosen03 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: "+idDosen);
        System.out.println("Nama: "+nama);
        System.out.println("Status Aktif: "+ (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: "+tahunBergabung);
        System.out.println("Bidang Keahlian: "+bidangKeahlian);
    }

    void setStatusAKtif(boolean status) {
        statusAktif = status;
        System.out.println("Status Telah Diubah Ke: "+ (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKeja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja: "+masaKerja+" tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen03() {

    }

    public Dosen03(String idDos, String nama, boolean statAktif, int tBergabung, String bKeahlian) {
        idDosen = idDos;
        this.nama = nama;
        statusAktif = statAktif;
        tahunBergabung = tBergabung;
        bidangKeahlian = bKeahlian;
    }
}
