import java.util.Scanner;

public class Matakuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    void tambahData(int i) {
        Scanner sc = new Scanner(System.in);
        String dummy;
        System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        System.out.print("Kode      : ");
        kode = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("Sks       : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("-------------------------");
    }

    void cetakInfo(int i) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        System.out.println("Kode      : " + kode);
        System.out.println("Nama      : " + nama);
        System.out.println("Sks       : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------");
    }
}
