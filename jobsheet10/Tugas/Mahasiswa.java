package Tugas;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private int semester;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String tampilkanMahasiswa() {
        return "NIM: " + nim +
                "\nNama: " + nama +
                "\nJurusan: " + jurusan +
                "\nSemester: " + semester +
                "\nIPK: " + ipk;
    }
}
