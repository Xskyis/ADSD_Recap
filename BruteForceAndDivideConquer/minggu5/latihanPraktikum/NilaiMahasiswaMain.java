package minggu5.latihanPraktikum;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        NilaiMahasiswa[] mahasiswa = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int maxUTS = NilaiMahasiswa.findMaxUTS(mahasiswa, 0, mahasiswa.length - 1);
        int minUTS = NilaiMahasiswa.findMinUTS(mahasiswa, 0, mahasiswa.length - 1);
        double avgUAS = NilaiMahasiswa.hitungRataUAS(mahasiswa);

        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + avgUAS);
    }
}
