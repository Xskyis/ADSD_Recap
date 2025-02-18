package latihan;

public class MataKuliah03 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public void tampilInforamsi() {
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah!");
    }

    public void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam;
    }

    public void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan!");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }

    public MataKuliah03() {

    }

    public MataKuliah03(String codeMK, String nm, int sks, int jmlJam) {
        kodeMK = codeMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
}
