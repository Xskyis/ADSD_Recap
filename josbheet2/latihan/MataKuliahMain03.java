package latihan;

public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 matkul1 = new MataKuliah03();
        matkul1.kodeMK = "CT01";
        matkul1.nama = "Critical Thinking";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        matkul1.tampilInforamsi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(2);
        matkul1.tampilInforamsi();

        System.out.println("----------------");

        MataKuliah03 matkul2 = new MataKuliah03("DP01", "Dasar Pemrograman", 4, 8);
        matkul2.tampilInforamsi();
        matkul2.ubahSKS(11);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(8);
        matkul2.tampilInforamsi();
    }
}
