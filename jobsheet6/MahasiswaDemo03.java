
import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jumMhs;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(jumMhs);
        Mahasiswa03[] mhs = new Mahasiswa03[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            mhs[i] = new Mahasiswa03();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------");

            mhs[i] = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(mhs[i]);
        }
        list.tampil();

        // Melakukan pencarian data bINARY
        System.out.println("----------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
