package latihan;

public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "D001";
        dosen1.nama = "Imam Fahrurozi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Dasar Pemrograman";


        dosen1.tampilInformasi();
        dosen1.setStatusAKtif(false);
        dosen1.hitungMasaKeja(2025);
        dosen1.ubahKeahlian("Pemrograman Berorientasi Objek");
        dosen1.tampilInformasi();

        System.out.println("----------------");

        Dosen03 dosen2 = new Dosen03("D002", "Budi Santoso", true, 2015, "Pemrograman Web");
        dosen2.tampilInformasi();
        dosen2.setStatusAKtif(false);
        dosen2.hitungMasaKeja(2025);
        dosen2.ubahKeahlian("Pemrograman Berbasis Web");
        dosen2.tampilInformasi();
    }
}
