package minggu5.latihanPraktikum;

public class NilaiMahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public NilaiMahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static int findMaxUTS(NilaiMahasiswa[] mahasiswa, int left, int right) {
        if (left == right) {
            return mahasiswa[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int maxLeft = findMaxUTS(mahasiswa, left, mid);
        int maxRight = findMaxUTS(mahasiswa, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    // Divide and Conquer untuk mencari nilai UTS terendah
    public static int findMinUTS(NilaiMahasiswa[] mahasiswa, int left, int right) {
        if (left == right) {
            return mahasiswa[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int minLeft = findMinUTS(mahasiswa, left, mid);
        int minRight = findMinUTS(mahasiswa, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataUAS(NilaiMahasiswa[] mahasiswa) {
        int total = 0;
        for (NilaiMahasiswa mhs : mahasiswa) {
            total += mhs.nilaiUAS;
        }
        return (double) total / mahasiswa.length;
    }
}
