
import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jmlData = sc.nextInt();

        Mahasiswa03[] arrMhs = new Mahasiswa03[jmlData];
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(jmlData);

        for (int i = 0; i < jmlData; i++) {
            arrMhs[i] = new Mahasiswa03();
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM: ");
            String nim = sc.next();
            System.out.print("Masukkan Nama: ");
            String nama = sc.next();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc.next();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            System.out.println();

            arrMhs[i] = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(arrMhs[i]);
        }

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        // list.SelectionSort();
        // list.tampil();

        System.out.println("Data Mahasiswa yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
