public class Mahasiswa03 {
    String nim, nama, kelas, ipk;

    public Mahasiswa03(String nm, String name, String kls, String ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.print(nim + "\t" + nama + "\t" + kelas + "\t" + ipk + "\n");
    }
}
