package Tugas;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antrianKRS = new Antrian(10, 30);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS MAHASISWA ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Proses KRS (2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Terakhir");
            System.out.println("6.  Cek Apakah Antrian Kosong");
            System.out.println("7.  Cek Apakah Antrian Penuh");
            System.out.println("8.  Kosongkan Antrian");
            System.out.println("9.  Tampilkan Jumlah Antrian");
            System.out.println("10. Tampilkan Jumlah Mahasiswa yang Sudah Proses KRS");
            System.out.println("11. Tampilkan Jumlah Mahasiswa yang Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrianKRS.isFull()) {
                        System.out.println("Maaf, antrian sudah penuh!");
                    } else {
                        System.out.println("\n=== INPUT DATA MAHASISWA ===");
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Jurusan: ");
                        String jurusan = sc.nextLine();
                        System.out.print("Semester: ");
                        int semester = sc.nextInt();
                        System.out.print("IPK: ");
                        double ipk = sc.nextDouble();
                        sc.nextLine(); // Mengonsumsi newline

                        Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan, semester, ipk);
                        antrianKRS.enqueue(mhs);
                        System.out.println("Mahasiswa berhasil ditambahkan ke antrian!");
                    }
                    break;

                case 2:
                    antrianKRS.processKRS();
                    break;
                case 3:
                    antrianKRS.displayAll();
                    break;
                case 4:
                    antrianKRS.displayFront2();
                    break;
                case 5:
                    antrianKRS.displayLast();
                    break;
                case 6:
                    if (antrianKRS.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 7:
                    if (antrianKRS.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                    break;
                case 8:
                    antrianKRS.clear();
                    System.out.println("Antrian berhasil dikosongkan.");
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrianKRS.getSize());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrianKRS.getJumlahProses());
                    break;
                case 11:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + antrianKRS.getBelumProses());
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian KRS!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
